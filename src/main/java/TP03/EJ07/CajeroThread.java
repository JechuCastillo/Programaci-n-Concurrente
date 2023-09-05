/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03.EJ07;

/**
 *
 * @author jesus
 */
public class CajeroThread extends Thread {

    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeroThread(String n, Cliente unCliente, long initial) {
        this.nombre = n;
        this.cliente = unCliente;
        this.initialTime = initial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public long getInitialTime() {
        return this.initialTime;
    }

    public void run() {
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getName()
                + "EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto " + (i + 1) + " del cliente " + this.cliente.getName() + " TIEMPO: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
        }
        System.out.println("El cajero" + this.nombre + " HA TERMINADO DE PROCESAR " + this.cliente.getName() + " EN EL TIEMPO: "
                + ((System.currentTimeMillis() - this.initialTime) / 1000) + " seg");
    }

    private void esperarXsegundos(int n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            System.out.println("HILO INTERRUMPIDO");
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
        CajeroThread cajero1 = new CajeroThread("Cajero1", cliente1, System.currentTimeMillis());
        CajeroThread cajero2 = new CajeroThread("Cajero2", cliente2, System.currentTimeMillis());
        cajero1.start();
        cajero2.start();
    }
}
