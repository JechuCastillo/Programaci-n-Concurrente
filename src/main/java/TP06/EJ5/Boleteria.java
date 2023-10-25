/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ5;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Boleteria {

    private Semaphore vender;
    private Semaphore comprar;
    private Semaphore pase;
    private int contador;

    public Boleteria() {
        this.vender = new Semaphore(0);
        this.comprar = new Semaphore(1);
        this.pase = new Semaphore(0);
        this.contador = 0;
    }

    public void vender() {
        try {
            this.vender.acquire();
            System.out.println("ENTRA");
            this.contador++;
            System.out.println("TICKET VENDIDOS: " + this.contador);
            this.comprar.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Boleteria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void comprar() {
        try {
            this.comprar.acquire();
            System.out.println("SE ACERCA CLIENTE");
            this.vender.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Boleteria.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
