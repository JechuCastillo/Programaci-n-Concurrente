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
public class TrenTuristico {

    private int asientosDisponibles;
    private int cantAsientos;
    private Semaphore pasajeros;
    private Semaphore recorrido;
    private Semaphore mutex;
    private Semaphore salida;

    public TrenTuristico(int c) {
        this.pasajeros = new Semaphore(c);
        this.cantAsientos = c;
        this.asientosDisponibles = c;
        this.recorrido = new Semaphore(0);
        this.mutex = new Semaphore(1);
        this.salida = new Semaphore(0);
    }

    public void subir() {
        try {
            this.pasajeros.acquire();
            this.mutex.acquire();
            this.asientosDisponibles--;
            System.out.println("SUBE PASAJERO, ASIENTOS DISPONIBLES" + this.asientosDisponibles);
            if (asientosDisponibles == 0) {
                this.recorrido.release();
            }
            this.mutex.release();

        } catch (InterruptedException ex) {
            Logger.getLogger(TrenTuristico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bajar() {
        try {
            this.salida.acquire();
            this.mutex.acquire();
            this.asientosDisponibles++;
            System.out.println("PASAJERO BAJA. ASIENTOS DISPONIBLES " + this.asientosDisponibles);
            if (this.asientosDisponibles == this.cantAsientos) {
                this.pasajeros.release(cantAsientos);
            }
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(TrenTuristico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarRecorrido() {
        try {
            this.recorrido.acquire();
            System.out.println("EL RECORRIDO INICIA");
        } catch (InterruptedException ex) {
            Logger.getLogger(TrenTuristico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void finalizarRecorrido() {
        System.out.println("EL RECORRIDO FINALIZA");
        this.salida.release(this.cantAsientos);
    }
}
