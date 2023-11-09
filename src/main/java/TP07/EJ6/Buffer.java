/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ6;

import TP07.EJ5.*;
import TP07.EJ4.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Buffer {

    private int cantidadProducido;
    private int cantidadConsumido;
    private int productoEnBuffer;

    public Buffer() {
        this.productoEnBuffer = 0;
        this.cantidadProducido = 0;
        this.cantidadConsumido = 0;
    }

    public synchronized void colocarProducto() {
        this.productoEnBuffer++;
        this.cantidadProducido++;
        System.out.println("Cantidad Producido: " + this.cantidadProducido);
        this.notify();
    }

    public synchronized void quitarProducto() {
        try {
            while (this.productoEnBuffer <= 0) {
                System.out.println("Buffer vacio");
                this.wait();
            }
            this.productoEnBuffer--;
            this.cantidadConsumido++;
            System.out.println("Cantidad consumido: " + this.cantidadConsumido);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
