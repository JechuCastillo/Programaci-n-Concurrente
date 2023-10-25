/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class ControlTren implements Runnable {

    TrenTuristico tren;

    public void run() {
        while (true) {
            this.tren.iniciarRecorrido();
            simularRecorrido();
            this.tren.finalizarRecorrido();
        }
    }

    public ControlTren(TrenTuristico t) {
        this.tren = t;
    }

    private void simularRecorrido() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControlTren.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
