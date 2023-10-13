/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ02;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class RecursoCompartido {

    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;

    public RecursoCompartido() {
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(1);
        this.sem3 = new Semaphore(0);
        this.sem4 = new Semaphore(0);
    }

    public void adquirirUno() {
        try {
            this.sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(RecursoCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarUno() {
        this.sem1.release();
    }

    public void adquirirDos() {
        try {
            this.sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(RecursoCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarDos() {
        this.sem2.release();
    }

    public void adquirirTres() {
        try {
            this.sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(RecursoCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarTres() {
        this.sem3.release();
    }

    public void adquirirCuatro() {
        try {
            this.sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(RecursoCompartido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void liberarCuatro() {
        this.sem4.release();
    }

}
