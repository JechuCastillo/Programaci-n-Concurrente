/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Gato implements Runnable {

    private Comedor comedor;

    public void run() {
        this.comedor.entrarGato();
        comer();
        this.comedor.salirGato();
    }

    public Gato(Comedor m) {
        this.comedor = m;
    }

    private void comer() {
        System.out.println("El gato esta comiendo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gato.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El gato termino de comer");
    }
}
