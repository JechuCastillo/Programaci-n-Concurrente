/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ5;

import TP07.EJ4.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Productor implements Runnable {

    private Buffer buffer;
    private String nombre;

    public Productor(Buffer buffer, String name) {
        this.buffer = buffer;
        this.nombre = name;
    }

    public void run() {
        while (true) {
            this.buffer.colocarProducto(this.nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
