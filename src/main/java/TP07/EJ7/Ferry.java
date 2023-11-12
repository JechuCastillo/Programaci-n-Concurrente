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
    private boolean pasajerosLleno = false;
    private boolean autosLleno = false;
    private boolean enRecorrido = false;

    public Ferry(int capacidadPasajeros, int capacidadAutomoviles) {
        this.capacidadAutomoviles = capacidadAutomoviles;
        this.capacidadPasajeros = capacidadPasajeros;
        this.autosABordo = 0;
        this.pasajerosABordo = 0;
    }

    public synchronized void subirAutomovil() {
        // Si el ferry se llena deben esperar
        while (this.autosABordo >= this.capacidadAutomoviles) {
            if (this.enRecorrido) {
                System.out.println("Ferry aun no ha llegado, espere por favor");
            } else {
                System.out.println("El ferry ya no posee capacidad");
            }
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.autosABordo++;
        System.out.println("Automovil sube a bordo del ferry, autos a bordo: " + this.autosABordo);
        if (this.pasajerosABordo >= this.capacidadPasajeros && this.autosABordo >= this.capacidadAutomoviles) {
            this.enRecorrido = true;
            this.notifyAll();
        }
    }

    public synchronized void subirPasajero() {
        while (this.pasajerosABordo >= this.capacidadPasajeros || this.enRecorrido) {
            if (this.enRecorrido) {
                System.out.println("Ferry aun no ha llegado, espere por favor");
            } else {
                System.out.println("El ferry ya no posee capacidad");
            }
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ferry.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.pasajerosABordo++;
        System.out.println("Pasajero sube a bordo del ferry, pasajeros a bordo: " + this.pasajerosABordo);
        if (this.pasajerosABordo >= this.capacidadPasajeros && this.autosABordo >= this.capacidadAutomoviles) {
            this.enRecorrido = true;
            this.notifyAll();
        }
    }

    public synchronized void bajarPasajero() {
        while (this.enRecorrido) {
            System.out.println("Espere llegada al destino");
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
        while (this.enRecorrido) {
            System.out.println("espere llegada al destino");
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
        while (!this.enRecorrido) {
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
        System.out.println("Recorrido finalizado, pueden bajarse");
    }

    public synchronized void finalizarRecorrido() {
        this.enRecorrido = false;
        this.notifyAll();
    }

}
