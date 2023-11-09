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
public class Consumidor implements Runnable {

    private Buffer buffer;

    public Consumidor(Buffer b) {
        this.buffer = b;
    }

    public void run() {
        while (true) {
            this.buffer.quitarProducto();
            try {
                Thread.sleep(1100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
