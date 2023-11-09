/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ3;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class SalaEstudio {

    private Semaphore mesas;
    private int mesasUsadas;
    private int mesasDisponibles;
    private Semaphore mutexEntrada;
    private Semaphore mutex;

    public SalaEstudio(int cantMax) {
        this.mesas = new Semaphore(cantMax);
        this.mesasDisponibles = cantMax;
        this.mesasUsadas = 0;
        this.mutex = new Semaphore(1);

    }

    public void usarMesa() {
        try {
            this.mesas.acquire();
            this.mutex.acquire();
            this.mesasUsadas++;
            this.mesasDisponibles--;
            System.out.println("Un estudiante se sienta en la mesa, mesas usadas: " + this.mesasUsadas);
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void irse() {
        try {
            this.mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(SalaEstudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.mesasDisponibles++;
        this.mesasUsadas--;
        System.out.println("Un estudiante se va mesas disponibles " + this.mesasDisponibles);
        this.mutex.release();
        this.mesas.release();

    }
}
