/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ1;

/**
 *
 * @author jesus
 */
public class GestorPiscina implements Runnable {

    private Piscina pileta;

    public GestorPiscina(Piscina p) {
        this.pileta = p;
    }

    public void run() {
        while (true) {
            this.pileta.habilitarSalida();
        }
    }
}
