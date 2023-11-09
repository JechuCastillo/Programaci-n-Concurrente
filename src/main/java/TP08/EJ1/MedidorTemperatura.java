/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class MedidorTemperatura implements Runnable {

    private GestorSala sala;
    private int temperatura;
    private Random n = new Random();

    public MedidorTemperatura(GestorSala s) {
        this.sala = s;
    }

    public void run() {
        while (true) {
            this.temperatura = n.nextInt(2) + 30;
            this.sala.notificarTemperatura(this.temperatura);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MedidorTemperatura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
