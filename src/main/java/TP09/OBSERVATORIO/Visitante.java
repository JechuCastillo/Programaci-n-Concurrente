/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.OBSERVATORIO;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Visitante implements Runnable {

    private Observatorio observatorio;
    private boolean sillaRueda;
    private Random n = new Random();

    public void run() {
        boolean silla = false;
        if (silla) {
            this.observatorio.entrarSilla();
        } else {
            this.observatorio.entrarVisitante();
        }
        estudiarEstrellas();
        if (silla) {
            this.observatorio.salirSilla();
        } else {
            this.observatorio.salirVisitante();
        }
    }

    public Visitante(Observatorio obs) {
        this.observatorio = obs;
    }

    private void estudiarEstrellas() {
        System.out.println("Visitante observa las estrellas");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Visitante.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Visitante termina de observar");
    }
}
