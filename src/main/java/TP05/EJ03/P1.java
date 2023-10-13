/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class P1 implements Runnable {

    private SemaforosProcesos s;

    public P1(SemaforosProcesos p) {
        this.s = p;
    }

    public void run() {
        while (true) {
            this.s.adquirirUno();
            System.out.println("ESTAMOS EN P1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.s.liberarTres();
        }
    }
}
