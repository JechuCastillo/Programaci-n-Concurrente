/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ4;

import TP06.EJ3.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Comedor {

    private Semaphore salida;
    private Semaphore entrada;
    private Semaphore gatos;
    private Semaphore perros;
    private int cantidadPerros;
    private int cantidadGatos;
    private int comederosDisponibles;
    private int cantComederos;

    public Comedor(int cantComederos, int cantPerros, int cantGatos) {
        this.gatos = new Semaphore(cantComederos);
        this.perros = new Semaphore(0);
        this.entrada = new Semaphore(1);
        this.salida = new Semaphore(1);
        this.cantidadPerros = cantPerros;
        this.cantidadGatos = cantGatos;
        this.cantComederos = cantComederos;
        this.comederosDisponibles = cantComederos;
    }

    public void entrarGato() {
        try {
            this.gatos.acquire();
            this.entrada.acquire();
            comederosDisponibles--;
            System.out.println("ENTRA UN GATO COMEDEROS DISPONIBLES:" + this.comederosDisponibles);
            this.entrada.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void salirGato() {
        try {
            this.salida.acquire();
            this.comederosDisponibles++;
            System.out.println("UN GATO SE VA COMEDEROS DISPONIBLES:" + this.comederosDisponibles);
            this.cantidadGatos--;
            if (this.comederosDisponibles == this.cantComederos) {
                System.out.println("TERMINA EL TURNO DE LOS GATOS");
                if (this.cantidadPerros >= this.cantComederos) {
                    this.perros.release(this.cantComederos);
                } else {
                    this.perros.release(this.cantidadPerros);
                }
            }
            if (this.cantidadPerros == 0 && this.comederosDisponibles>0) {
                this.gatos.release();
            }
            this.salida.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salirPerro() {
        try {
            this.salida.acquire();
            this.comederosDisponibles=this.comederosDisponibles+2;
            System.out.println("UN PERRO SE VA COMEDEROS DISPONIBLES:" + this.comederosDisponibles);
            this.cantidadPerros--;
            if (this.comederosDisponibles == this.cantComederos) {
                System.out.println("TERMINA EL TURNO DE LOS PERROS");
                if (this.cantidadGatos >= this.cantComederos) {
                    this.gatos.release(this.cantComederos);
                } else {
                    this.gatos.release(this.cantidadGatos);
                }
            }
            if (this.cantidadGatos == 0 && this.comederosDisponibles>0) {
                this.perros.release();
            }
            this.salida.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void entrarPerro() {
        try {
            this.perros.acquire(2);
            this.entrada.acquire();
            this.comederosDisponibles=this.comederosDisponibles-2;
            System.out.println("ENTRA UN PERRO COMEDEROS DISPONIBLES:" + this.comederosDisponibles);
            this.entrada.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Comedor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
