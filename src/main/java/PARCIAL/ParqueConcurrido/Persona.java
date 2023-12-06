/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.ParqueConcurrido;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Persona implements Runnable {

    private Random n = new Random();
    private Parque parque;

    public Persona(Parque p) {
        this.parque = p;
    }

    public void run() {
        try {
            if (n.nextInt(2) == 0) {
                this.parque.entrarGeneral();
            } else {
                this.parque.entrarVecino();
            }
            System.out.println("Se divierte en el parque...");
            Thread.sleep(n.nextInt(3) * 1000);
            this.parque.salir();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
