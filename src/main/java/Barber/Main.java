/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barber;

import java.util.concurrent.Semaphore;

class Barberia {

    private Semaphore semSillon;
    private Semaphore semBarbero;
    private Semaphore semSalida;

    public Barberia() {
        semSillon = new Semaphore(1);
        semBarbero = new Semaphore(0);
        semSalida = new Semaphore(0);
    }

    public void clienteEntra() throws InterruptedException {
        // Verificar si el sillón está libre
        semSillon.acquire();

        // Solicitar atención al barbero
        semBarbero.release();

        // Esperar mientras el barbero me atiende
        semSalida.acquire();

        // Liberar el sillón
        semSillon.release();
    }

    public void barberoAtiende() throws InterruptedException {
        while (true) {
            // Esperar a que llegue un cliente
            semBarbero.acquire();

            // Simular el proceso de corte de pelo
            System.out.println("El barbero está atendiendo a un cliente...");
            Thread.sleep(2000); // Simula el tiempo de atención

            // Terminar de atender al cliente
            semSalida.release();
        }
    }
}

class Cliente implements Runnable {

    private Barberia barberia;

    public Cliente(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        try {
            barberia.clienteEntra();
            System.out.println("El cliente ha sido atendido.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Barbero implements Runnable {

    private Barberia barberia;

    public Barbero(Barberia barberia) {
        this.barberia = barberia;
    }

    @Override
    public void run() {
        try {
            barberia.barberoAtiende();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Barberia barberia = new Barberia();
        Thread barberoThread = new Thread(new Barbero(barberia));
        Thread clienteThread1 = new Thread(new Cliente(barberia));
        Thread clienteThread2 = new Thread(new Cliente(barberia));

        barberoThread.start();
        clienteThread1.start();
        clienteThread2.start();
    }
}
