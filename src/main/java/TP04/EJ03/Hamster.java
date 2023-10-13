/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Hamster implements Runnable {

    private String nombre;
    private Plato plato;
    private Rueda rueda;
    private Hamaca hamaca;

    public Hamster(String nombre, Plato p, Rueda r, Hamaca h) {
        this.nombre = nombre;
        this.plato = p;
        this.rueda = r;
        this.hamaca = h;
    }

    public String getNombre() {
        return nombre;
    }

    public void run() {
        try {
            plato.comer(this);
            rueda.ejercitar(this);
            hamaca.dormir(this);
        } catch (InterruptedException ex) {
            System.out.println("ERROR DE EJECUCION INTERRUMPIDA");
        }
    }

}
