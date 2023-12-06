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
public class Traductor implements Runnable {

    private Serie serie;
    private int num;

    public Traductor(Serie s, int num) {
        this.serie = s;
        this.num = num;
    }

    public void run() {
        try {
            while (true) {
                this.serie.empezarAtraducir(this.num);
                Thread.sleep(8000);
                this.serie.terminarDeTraducir(this.num);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Traductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
