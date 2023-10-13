/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ06;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Taxi {

    private Semaphore subir;
    private Semaphore bajar;
    private Semaphore aviso;

    public Taxi() {
        this.subir = new Semaphore(1);
        this.bajar = new Semaphore(0);
        this.aviso = new Semaphore(0);
    }

    public void subir(String p) {
        try {
            this.subir.acquire();
            System.out.println(p + " SUBE AL TAXI");
            this.aviso.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bajar(String p) {
        try {
            this.bajar.acquire();
            System.out.println(p + " BAJA DEL TAXI");
            this.subir.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void terminarViaje() {
        System.out.println("Viaje finalizado");
        this.bajar.release();
    }

    public void esperar() {
        try {
            this.aviso.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
