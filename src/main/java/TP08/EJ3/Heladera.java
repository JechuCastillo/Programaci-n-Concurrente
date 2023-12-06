/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ3;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Heladera {

    private int cantidadCarne;
    private int cantidadVegetales;
    private int cantidadPasta;
    private ReentrantLock tomarIngrediente;
    private Condition hayCarne;
    private Condition hayVegetales;
    private Condition hayPasta;
    private Condition faltaIngrediente;
    private Random n = new Random();

    public Heladera(int cantCarne, int cantVegetales, int cantPastas) {
        this.cantidadCarne = cantCarne;
        this.cantidadPasta = cantPastas;
        this.cantidadVegetales = cantVegetales;
        this.tomarIngrediente = new ReentrantLock(true);
        this.hayCarne = tomarIngrediente.newCondition();
        this.hayPasta = tomarIngrediente.newCondition();
        this.hayVegetales = tomarIngrediente.newCondition();
        this.faltaIngrediente = tomarIngrediente.newCondition();
    }

    public void agarrarCarne() {
        this.tomarIngrediente.lock();
        try {
            while (this.cantidadCarne <= 0) {
                System.out.println("No hay carne");
                this.hayCarne.await();
            }
            this.cantidadCarne--;
            System.out.println("Toma carne para su receta\n Cantidad de carne:" + this.cantidadCarne);
            if (this.cantidadCarne == 0) {
                this.faltaIngrediente.signal();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Heladera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.tomarIngrediente.unlock();
        }
    }

    public void agarrarVegetales() {
        this.tomarIngrediente.lock();
        try {
            while (this.cantidadVegetales <= 0) {
                System.out.println("No hay vegetales");
                this.hayVegetales.await();
            }
            this.cantidadVegetales--;
            System.out.println("Toma sus vegetales para la receta\nCantidad vegetales: "+this.cantidadVegetales);
            if (this.cantidadVegetales == 0) {
                this.faltaIngrediente.signal();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Heladera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.tomarIngrediente.unlock();
        }
    }

    public void agarrarPasta() {
        this.tomarIngrediente.lock();
        try {
            while (this.cantidadPasta <= 0) {
                System.out.println("No hay pasta");
                this.hayPasta.await();
            }
            System.out.println("Agarra pasta para su receta\n Cantidad de pasta:"+this.cantidadPasta);
            this.cantidadPasta--;
            if (this.cantidadPasta == 0) {
                this.faltaIngrediente.signal();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Heladera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.tomarIngrediente.unlock();
        }
    }

    public void reponer() {
        this.tomarIngrediente.lock();
        try {
            while (this.cantidadCarne > 0 && this.cantidadPasta > 0 && this.cantidadVegetales > 0) {
                this.faltaIngrediente.await();
            }
            if (this.cantidadCarne == 0) {
                this.cantidadCarne = n.nextInt(20) + 1;
                System.out.println("Repone carne: " + this.cantidadCarne);
                this.hayCarne.signal();
            }
            if (this.cantidadPasta == 0) {
                this.cantidadPasta = n.nextInt(20) + 1;
                System.out.println("Repone pasta: " + this.cantidadPasta);
                this.hayPasta.signal();
            }
            if (this.cantidadVegetales == 0) {
                this.cantidadVegetales = n.nextInt(20) + 1;
                System.out.println("Repone vegetales: " + this.cantidadVegetales);
                this.hayVegetales.signal();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Heladera.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.tomarIngrediente.unlock();
        }
    }
}
