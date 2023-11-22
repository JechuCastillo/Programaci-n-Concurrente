/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class PersonajeOscuridad implements Runnable {

    private Muñeco muñeco;
    public PersonajeOscuridad(Muñeco munieco) {
        this.muñeco=munieco;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            this.muñeco.ataqueOscuridad();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PersonajeOscuridad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
