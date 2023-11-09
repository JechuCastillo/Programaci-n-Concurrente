/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ7;

/**
 *
 * @author jesus
 */
public class Pasajero implements Runnable {

    private Ferry ferry;

    public Pasajero(Ferry ferry) {
        this.ferry = ferry;
    }

    public void run() {
        this.ferry.subirPasajero();
        this.ferry.bajarPasajero();
    }
}
