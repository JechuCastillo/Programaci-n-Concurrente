/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.CANIBALES;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Cocinero implements Runnable {

    private OllaComun olla;

    public void run() {
        while (true) {
            this.olla.cocinar();
            simularCocina();
            this.olla.llenarOlla();
        }
    }

    private void simularCocina() {
        System.out.println("El cocinero cocina");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cocinero(OllaComun olla) {
        this.olla = olla;
    }
}
