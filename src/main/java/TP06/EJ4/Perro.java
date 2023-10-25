/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ4;

import TP06.EJ3.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Perro implements Runnable {

    private Comedor comedor;

    public void run() {
        this.comedor.entrarPerro();
        comer();
        this.comedor.salirPerro();
    }

    public Perro(Comedor m) {
        this.comedor = m;
    }

    private void comer() {
        System.out.println("EL PERRO ESTA COMIENDO");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gato.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El PERRO termino de comer");
    }
}
