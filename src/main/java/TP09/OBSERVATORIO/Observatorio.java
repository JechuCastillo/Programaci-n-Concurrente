/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.OBSERVATORIO;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Observatorio {

    private int capacidad;
    private int personasEnSala;
    private int mantenimientoEnSala;
    private int visitaEnSala;
    private int investigadorEnSala;
    private int sillaDeRueda;

    public Observatorio(int capacidad) {
        this.capacidad = capacidad;
        this.visitaEnSala = 0;
        this.mantenimientoEnSala = 0;
        this.investigadorEnSala = 0;
        this.sillaDeRueda = 0;
    }

    public synchronized void entrarVisitante() {
        try {
            while (this.personasEnSala >= capacidad || this.investigadorEnSala >= 1 || this.mantenimientoEnSala >= 1) {
                this.wait();
            }
            this.personasEnSala++;
            this.visitaEnSala++;
            System.out.println("Entra un visitante, personas en sala: " + this.personasEnSala);
        } catch (InterruptedException ex) {
            Logger.getLogger(Observatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void entrarMantenimiento() {
        try {
            while (this.personasEnSala >= capacidad || this.investigadorEnSala > 0 || this.visitaEnSala > 0) {
                this.wait();
            }
            this.personasEnSala++;
            this.mantenimientoEnSala++;
            System.out.println("Empleado de mantenimiento ingresa a la sala, empleados en sala: " + this.personasEnSala);
        } catch (InterruptedException ex) {
            Logger.getLogger(Observatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized void entrarInvestigador() {
        try {
            while (this.personasEnSala > 0) {
                this.wait();
            }
            this.personasEnSala++;
            this.investigadorEnSala++;
            System.out.println("Investigador entra en la sala, investigadores en sala: " + this.personasEnSala);
        } catch (InterruptedException ex) {
            Logger.getLogger(Observatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void salirInvestigador() {
        System.out.println("El investigador a concluido su turno y se retira");
        this.personasEnSala--;
        this.investigadorEnSala--;
        this.notifyAll();
    }

    public synchronized void salirMantenimiento() {
        System.out.println("Un empleado de mantenimiento se retira");
        this.personasEnSala--;
        this.mantenimientoEnSala--;
        this.notifyAll();
    }

    public synchronized void salirVisitante() {
        System.out.println("Visitante se retira");
        this.personasEnSala--;
        this.visitaEnSala--;
        this.notifyAll();
    }

    public synchronized void entrarSilla() {
        try {
            while (this.personasEnSala >= this.capacidad || this.investigadorEnSala > 0 || this.personasEnSala > 0) {
                wait();
            }
            this.personasEnSala++;
            this.sillaDeRueda++;
            this.capacidad = 30;
            System.out.println("Ingresa persona en silla de ruedas capacidad: " + this.capacidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(Observatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void salirSilla() {
        System.out.println("Se retira persona en silla de ruedas");
        this.personasEnSala--;
        this.sillaDeRueda--;
        if (this.sillaDeRueda == 0) {
            this.capacidad = 50;
            System.out.println("Capacidad restaurada: " + this.capacidad);
        }
        this.notifyAll();
    }
}
