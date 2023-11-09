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
public class Persona implements Runnable {

    private String nombre;
    private GestorSala sala;
    private int edad;
    private Random n = new Random();

    public void run() {
        if (this.edad > 65) {
            this.sala.entrarSalaJubilado();
        } else {
        }
            this.sala.entrarSala();
        try {
            Thread.sleep((n.nextInt(6) + 1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sala.salirSala();
    }

    public Persona(String nombre, GestorSala sala, int edad) {
        this.nombre = nombre;
        this.sala = sala;
        this.edad = edad;
    }

}
