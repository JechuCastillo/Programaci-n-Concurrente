/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Parrillero implements Runnable {

    private Heladera heladera;

    public void run() {
        while (true) {
            try {
                this.heladera.agarrarCarne();
                System.out.println("Parrillero agarra la carne y la tira a la parrilla");
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Parrillero.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("El parrillero termino de hacer la carne");
        }
    }

    public Parrillero(Heladera h) {
        this.heladera = h;
    }

}
