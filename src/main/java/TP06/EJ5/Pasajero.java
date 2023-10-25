/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ5;

/**
 *
 * @author jesus
 */
public class Pasajero implements Runnable {

    private TrenTuristico tren;
    private Boleteria garita;

    public void run() {
        this.garita.comprar();
        this.tren.subir();
        this.tren.bajar();
    }

    public Pasajero(TrenTuristico tren, Boleteria garita) {
        this.tren = tren;
        this.garita = garita;
    }
}
