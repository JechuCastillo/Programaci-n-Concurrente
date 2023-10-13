/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ04;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Impresora {

    private Semaphore impresion = new Semaphore(1);

    public Impresora() {

    }

    public boolean imprimir() {
        return this.impresion.tryAcquire();
    }
    public void terminarImprimir(){
        this.impresion.release();
    }
}
