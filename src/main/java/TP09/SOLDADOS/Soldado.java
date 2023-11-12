/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.SOLDADOS;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Soldado implements Runnable {

    private Comedor comedor;

    public void run() {
        this.comedor.entrar();
        this.comedor.servirComida();
        comer();
        this.comedor.servirPostre();
        this.comedor.irse();
    }

    public Soldado(Comedor c) {
        this.comedor = c;
    }

    private void comer() {
        System.out.println("Soldado comiendo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Soldado.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Soldado termino de comer");
    }
}
