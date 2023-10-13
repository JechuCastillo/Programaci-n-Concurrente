/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barbero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Barbero implements Runnable {

    private Sillon sillon;

    public Barbero(Sillon s) {
        this.sillon = s;
    }

    public void run() {
        while (true) {
            sillon.esperar();
            this.atender();
            sillon.terminarUso();
        }
    }

    public void atender() {
        try {
            System.out.println("Atendiendo al cliente sentado");
            Thread.sleep(2000);
            System.out.println("Servicio finalizado");
        } catch (InterruptedException ex) {
        }
    }

}
