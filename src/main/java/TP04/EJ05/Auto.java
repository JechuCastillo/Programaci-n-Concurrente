/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ05;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Auto extends Vehiculo implements Runnable {

    private Surtidor surtidor;
    private int km;
    private String patente;
    private int capacidad=40;

    public void run() {
        andar();
    }

    public Auto(String marca, int modelo, int km, String patente, Surtidor s) {
        super(marca, modelo);
        this.km = km;
        this.patente = patente;
        this.surtidor = s;
    }

    public String getPatente() {
        return patente;
    }

    public void andar() {
        Random n = new Random();
        int avance;
        while (this.capacidad>20) {
            avance=n.nextInt(5);
            this.capacidad=capacidad-avance;
            this.km=this.km+avance*10;
        }
        surtidor.cargarCombustible(this);

    }

}
