/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ7;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;

/**
 *
 * @author jesus
 */
public class Ferry {

    private int capacidadPasajeros;
    private int capacidadAutomoviles;
    private int autosABordo;
    private int pasajerosABordo;
    private boolean autosListo = false;
    private boolean pasajeroListo = false;
    private boolean recorrido = false;
    private int cantAutos;
    private int cantPasajeros;

    public Ferry(int capacidadPasajeros, int capacidadAutomoviles, int cantAutos, int cantPasajeros) {
        this.capacidadAutomoviles = capacidadAutomoviles;
        this.capacidadPasajeros = capacidadPasajeros;
        this.autosABordo = 0;
        this.pasajerosABordo = 0;
        this.cantAutos = cantAutos;
        this.cantPasajeros = cantPasajeros;
    }

    public synchronized void subirAutomovil() {
        while (this.autosABordo >= this.capacidadAutomoviles) {
            System.out.println("El ferry ya no posee capacidad");
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.autosABordo++;
        System.out.println("Automovil sube a bordo del ferry, autos a bordo: " + this.autosABordo);
        if (this.autosABordo == this.capacidadAutomoviles || this.cantAutos == 0) {
            this.autosListo = true;
            this.recorrido = this.autosListo && this.pasajeroListo;
            this.notifyAll();
        }
    }

    public synchronized void subirPasajero() {
        while (this.pasajerosABordo >= this.capacidadPasajeros) {
            System.out.println("Limite de pasajeros alcanzado, por favor espera la siguiente vuelta");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.pasajerosABordo++;
        System.out.println("Pasajero sube a bordo del ferry, pasajeros a bordo: " + this.pasajerosABordo);
        if (this.pasajerosABordo == this.capacidadPasajeros) {
            this.pasajeroListo = true;
            this.recorrido = this.autosListo && this.pasajeroListo;
            this.notifyAll();
        }
    }

    public synchronized void bajarPasajero() {
        while (this.recorrido) {
            System.out.println("Ferry en movimiento, espere llegada al destino");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.pasajerosABordo--;
        System.out.println("Pasajero desciende, pasajeros a bordo: " + this.pasajerosABordo);
    }

    public synchronized void bajarAuto() {
        while (this.recorrido) {
            System.out.println("Ferry en movimiento, espere llegada al destino");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.autosABordo--;
        System.out.println("Pasajero desciende, pasajeros a bordo: " + this.autosABordo);

    }

    public synchronized void iniciarRecorrido() {
        while (!this.recorrido) {
            System.out.println("Aun no estan listos");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Comienza el recorrido");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
