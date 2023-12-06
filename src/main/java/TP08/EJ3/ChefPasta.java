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
public class ChefPasta implements Runnable {

    private Heladera heladera;

    public void run() {
        while (true) {
            this.heladera.agarrarPasta();
            this.heladera.agarrarVegetales();
            System.out.println("El chef hace la pasta");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefPasta.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Plato de pasta entregado");
        }
    }

    public ChefPasta(Heladera h) {
        this.heladera = h;
    }

}
