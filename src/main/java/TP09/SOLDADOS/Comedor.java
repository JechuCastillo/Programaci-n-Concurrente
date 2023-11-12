/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.SOLDADOS;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author jesus
 */
public class Comedor {

    private Semaphore lugar;
    private Semaphore mostradorAlmuerzo;
    private Semaphore mostradorPostre;
    private Semaphore abridor;
    private int soldadosEnSala = 0;
    private Semaphore mutex;
    private Random n = new Random();
    private int contador = 0;
    public Comedor(int capacidad, int mostradorAlmuerzo, int mostradorPostre, int cantAbridores) {
        this.lugar = new Semaphore(capacidad);
        this.mostradorAlmuerzo = new Semaphore(mostradorAlmuerzo);
        this.mostradorPostre = new Semaphore(mostradorPostre);
        this.mutex = new Semaphore(1);
        this.abridor = new Semaphore(cantAbridores);
    }

    public void entrar() {
        try {
            this.lugar.acquire();
            this.mutex.acquire();
            this.soldadosEnSala++;
            System.out.println("Un soldado entra en el recinto, soldados en sala: " + this.soldadosEnSala);
            this.mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void servirComida() {
        try {
            this.mostradorAlmuerzo.acquire();
            System.out.println("Soldado toma una bandeja y se sirve comida");
            if (n.nextInt(2) == 1) {
                System.out.println("Se sirve agua");
            } else {
                this.abridor.acquire();
                System.out.println("Se sirve gaseosa y toma un abridor");
                abrirGaseosa();
            }
            System.out.println("El soldado se va a comer");
            this.mostradorAlmuerzo.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirGaseosa() {
        System.out.println("Soldado abre la gaseosa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Termino de abrir la gaseosa y deja el abridor");
        this.abridor.release();
    }

    public void servirPostre() {
        if (n.nextInt(2) == 0) {
            System.out.println("El soldado NO quiere postre");
        } else {
            try {
                this.mostradorPostre.acquire();
                System.out.println("El soldado SI quiere postre y se sirve");
                this.mostradorPostre.release();
                comerPostre();
            } catch (InterruptedException ex) {
                Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void comerPostre() {
        System.out.println("El soldado se sirve postre y lo disfruta");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El soldado termino ");
    }

    public void irse() {
        try {
            this.mutex.acquire();
            System.out.println("El soldado esta lleno y se va");
            this.soldadosEnSala--;
            this.contador++;
            System.out.println("Soldados en sala: " + this.soldadosEnSala);
            System.out.println("Pasaron: "+this.contador);
            this.mutex.release();
            this.lugar.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
