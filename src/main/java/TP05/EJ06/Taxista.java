/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Taxista implements Runnable {

    private Random r = new Random();
    private Taxi taxi;

    public Taxista(Taxi t) {
        this.taxi = t;
    }

    public void run() {
        while (true) {
            this.taxi.esperar();
            hacerRecorrido();
            this.taxi.terminarViaje();
        }
    }

    public void hacerRecorrido() {
        try {
            Thread.sleep(r.nextInt(5) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
