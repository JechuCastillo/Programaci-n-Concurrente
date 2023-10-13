/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Piscina {

    private int capacidad;
    private Semaphore entrada;
    private Semaphore salida;
    private Semaphore avisoSalida;

    public Piscina(int capacidad) {
        this.capacidad = capacidad;
        this.entrada = new Semaphore(capacidad);
        this.salida = new Semaphore(0);
        this.avisoSalida = new Semaphore(0);
    }

    public void salir(String n) {
        try {
            this.avisoSalida.release();
            this.salida.acquire();
            System.out.println(n + " Sale de la piscina");
            this.capacidad++;
            this.entrada.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Piscina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void entrar(String n) {
        try {
            this.entrada.acquire();
            System.out.println(n + " ENTRA A LA PISCINA");
            this.capacidad--;
        } catch (InterruptedException ex) {
            Logger.getLogger(Piscina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void habilitarSalida() {
        try {
            this.avisoSalida.acquire();
            this.salida.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Piscina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
