/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Buffer {

    private int maximo;
    private int espacioDisponible;
    private int espacioUsado;

    public Buffer(int max) {
        this.maximo = max;
        this.espacioDisponible = max;
        this.espacioUsado = 0;

    }

    public synchronized void colocarProducto() {
        try {
            while (this.espacioUsado >= this.maximo) {
                System.out.println("LA CINTA SE LLENO, EL PRODUCTOR ESPERA");
                wait();
            }
        } catch (InterruptedException ex) {
        }
        this.espacioUsado++;
        System.out.println("EL PRODUCTOR COLOCA UN PRODUCTO EN LA CINTA, cantidad: "+this.espacioUsado);
        this.espacioDisponible--;
        this.notify();
    }

    public synchronized void quitarProducto() {
        try {
            while (this.espacioDisponible >= this.maximo) {
                System.out.println("LA CINTA ESTA VACIA");
                wait();
            }
        } catch (InterruptedException e) {
        }
        System.out.println("CONSUMIDOR QUITA UN PRODUCTO, productos en cinta: "+this.espacioUsado);
        this.espacioDisponible++;
        this.espacioUsado--;
        this.notify();
    }
}
