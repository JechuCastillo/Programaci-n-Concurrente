/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Comedor {

    private Semaphore asientos;
    private Semaphore beber;
    private Semaphore comer;
    private Semaphore pedidoBebida;
    private Semaphore pedirComida;
    private Semaphore mozo;

    public Comedor() {
        this.asientos = new Semaphore(2);
        this.mozo = new Semaphore(1);
        this.beber = new Semaphore(0);
        this.pedidoBebida= new Semaphore(0);
    }

    public void sentarse() {
        try {
            this.asientos.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pedirBebida(String n) {
        try {
            this.mozo.acquire();
            System.out.println(n + "Llama al mozo y pide su bebida");
            pedidoBebida.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tomarPedidoBebida() {
        try {
            this.pedidoBebida.acquire();
            System.out.println("Mozo toma pedido");
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void entregarBebida() {
        System.out.println("Bebida entregada a");
        this.beber.release();
        this.mozo.release();
    }

    public void beber() {
        try {
            this.beber.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void irse(String n) {
        System.out.println(n+" SE VA");
        this.asientos.release();
    }
}
