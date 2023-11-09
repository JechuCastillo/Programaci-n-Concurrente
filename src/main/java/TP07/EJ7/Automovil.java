/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ7;

/**
 *
 * @author jesus
 */
public class Automovil implements Runnable {

    private Ferry ferry;
    private int espacioQueOcupa;

    public Automovil(Ferry ferry, int espacio) {
        this.ferry = ferry;
        this.espacioQueOcupa = espacio;
    }

    public void run() {
        this.ferry.subirAutomovil();
        this.ferry.bajarAuto();
    }
}
