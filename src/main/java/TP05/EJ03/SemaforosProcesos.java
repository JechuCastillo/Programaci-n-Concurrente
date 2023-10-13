/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ03;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class SemaforosProcesos {

    private Semaphore semUno = new Semaphore(1);
    private Semaphore semDos = new Semaphore(0);
    private Semaphore semTres = new Semaphore(0);

    public SemaforosProcesos() {

    }

    public void adquirirUno() {
        try {
            this.semUno.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaforosProcesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarUno() {
        this.semUno.release();
    }

    public void adquirirDos() {
        try {
            this.semDos.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaforosProcesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarDos() {
        this.semDos.release();
    }

    public void adquirirTres() {
        try {
            this.semTres.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaforosProcesos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarTres() {
        this.semTres.release();
    }

}
