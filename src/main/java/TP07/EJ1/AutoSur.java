/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class AutoSur implements Runnable{
    private PuenteEstrecho puente;
    public AutoSur(PuenteEstrecho p){
        this.puente=p;
    }
    public void run(){
        this.puente.pasarSur();
        cruzar();
        this.puente.terminarDePasarSur();
    }
    
    public void cruzar(){
        System.out.println("Cruzando auto del sur...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AutoSur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
