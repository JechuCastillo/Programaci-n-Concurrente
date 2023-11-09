/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.SOLDADOS;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Comedor {

    private Semaphore capacidad;
    private Semaphore mostradorAlmuerzo;
    private Semaphore mostradorPostre;
    private int soldadosEnSala = 0;
    private Semaphore mutex;

    public Comedor(int capacidad, int mostradorAlmuerzo, int mostradorPostre) {
        this.capacidad = new Semaphore(capacidad);
        this.mostradorAlmuerzo = new Semaphore(mostradorAlmuerzo);
        this.mostradorPostre = new Semaphore(mostradorPostre);
        this.mutex= new Semaphore(1);
    }

    public void entrar() {
        try {
            this.capacidad.acquire();
            this.mutex.acquire();
            this.soldadosEnSala++;
            System.out.println("Un soldado entra en el recint, soldados en sala: "+this.soldadosEnSala);
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void servirAlmuerzo(){
        try {
            this.mostradorAlmuerzo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
