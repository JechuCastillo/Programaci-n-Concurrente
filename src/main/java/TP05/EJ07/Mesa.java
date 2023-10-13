/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ07;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Mesa {

    private Semaphore mesaLibre;
    private Semaphore atender;
    private Semaphore salir;

    public Mesa() {
        this.mesaLibre = new Semaphore(1);
        this.atender = new Semaphore(0);
        this.salir = new Semaphore(1);
    }

    public void sentarse(String n) {
        try {
            this.mesaLibre.acquire();
            System.out.println(n + " Se sienta en la mesa");
            this.atender.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void irse(String n) {
        try {
            this.salir.acquire();
            System.out.println(n + " Termino de comer y se va");
            this.mesaLibre.release();
            this.salir.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atender() {
        try {
            this.atender.acquire();
            System.out.println("MOZO ATIENDE AL EMPLEADO");
        } catch (InterruptedException ex) {
            Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
