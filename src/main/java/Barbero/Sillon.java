/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barbero;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Sillon {

    private Semaphore barbero;
    private Semaphore salida;
    private Semaphore sillon;

    public Sillon() {
        this.barbero = new Semaphore(0);
        this.salida = new Semaphore(0);
        this.sillon = new Semaphore(1);
    }

    public void esperar() {
        try {
            this.barbero.acquire();
        } catch (InterruptedException e) {
            System.out.println("a");
        }
    }

    public synchronized void usar() {
        try {
            System.out.println("Cliente verifica si esta libre el sillon");
            this.sillon.acquire();
            System.out.println("Cliente se sienta en el sillon");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void terminarUso() {
        System.out.println("El cliente se puede ir");
        this.salida.release();
    }

    public void solicitarAtencion() {
        System.out.println("Cliente pide atencion");
        this.barbero.release();
    }

    public void meCortanElPelo() {
        try {
            this.salida.acquire();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void liberarSillon() {
        this.sillon.release();
    }
    
}
