/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ06;

/**
 *
 * @author jesus
 */
public class Pasajero implements Runnable {

    private Taxi taxi;
    private String nombre;

    public Pasajero(String n, Taxi t) {
        this.nombre = n;
        this.taxi = t;
    }

    public void run() {
        this.taxi.subir(nombre);
        this.taxi.bajar(nombre);
    }

}
