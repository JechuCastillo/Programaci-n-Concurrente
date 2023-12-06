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
public class Ensaladero implements Runnable {

    private Heladera heladera;

    public void run() {
        while(true){
            this.heladera.agarrarVegetales();
            System.out.println("Cocinero prepara la ensalada");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ensaladero.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Ensalada hecha y entregada");
        }
    }

    public Ensaladero(Heladera h) {
        this.heladera = h;
    }
}
