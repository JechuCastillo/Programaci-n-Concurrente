/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.ParqueConcurrido;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Parque {

    private int capacidad;
    private int genteDentro;
    private ReentrantLock lock;
    private Condition hayLugar;
    private Condition esVecino;
    private int cantidadVecinos;

    public Parque(int capacidad) {
        this.capacidad = capacidad;
        this.genteDentro = 0;
        this.cantidadVecinos = 0;
        this.lock = new ReentrantLock(true);
        this.hayLugar = lock.newCondition();
        this.esVecino = lock.newCondition();
    }

    public void entrarGeneral() {
        this.lock.lock();
        try {
            while (this.genteDentro >= this.capacidad || this.cantidadVecinos > 0) {
                this.hayLugar.await();
            }
            this.genteDentro++;
            System.out.println("Entra alguien de afuera del barrio: " + this.genteDentro);
        } catch (InterruptedException ex) {
            Logger.getLogger(Parque.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.lock.unlock();
        }

    }

    public void entrarVecino() {
        this.lock.lock();
        this.cantidadVecinos++;
        try {
            while (this.genteDentro >= this.capacidad) {
                this.esVecino.await();
            }
            this.cantidadVecinos--;
            this.genteDentro++;
            System.out.println("Entra un vecino al parque: " + this.genteDentro);
        } catch (InterruptedException ex) {
            Logger.getLogger(Parque.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.lock.unlock();
        }
    }

    public void salir() {
        this.lock.lock();
        this.genteDentro--;
        if (this.cantidadVecinos > 0) {
            this.esVecino.signal();
        } else {
            this.hayLugar.signal();
        }
        System.out.println("Se va una persona:" + this.genteDentro);
        this.lock.unlock();
    }
}
