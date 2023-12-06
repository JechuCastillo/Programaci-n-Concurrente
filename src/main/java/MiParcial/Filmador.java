/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiParcial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Filmador implements Runnable{

    private Serie serie;

    public Filmador(Serie s) {
        this.serie = s;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(5000);
                this.serie.filmar();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Filmador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
