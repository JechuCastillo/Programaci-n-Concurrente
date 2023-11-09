/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.CANIBALES;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class OllaComun {

    private int racionesEnOlla;
    private int racionesTotales;
    private Semaphore cocinero;
    private Semaphore canibal;

    public OllaComun(int raciones) {
        this.racionesTotales = raciones;
        this.racionesEnOlla = raciones;
        this.cocinero = new Semaphore(0);
        this.canibal = new Semaphore(1);
    }

    public void servirse() {
        try {
            this.canibal.acquire();
            this.racionesEnOlla--;
            System.out.println("Un canibal se sirve, raciones en olla: " + this.racionesEnOlla);
            if (this.racionesEnOlla == 0) {
                System.out.println("No hay mas comida en la olla despertamos al cocinero");
                this.cocinero.release();
            } else {
                this.canibal.release();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(OllaComun.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cocinar() {
        try {
            this.cocinero.acquire();
            System.out.println("El cocinero se despierta y cocina");
        } catch (InterruptedException ex) {
            Logger.getLogger(OllaComun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarOlla() {
        System.out.println("El cocinero llena la olla");
        this.racionesEnOlla = this.racionesTotales;
        System.out.println("Raciones en olla: " + this.racionesEnOlla);
        this.canibal.release();
    }
}
