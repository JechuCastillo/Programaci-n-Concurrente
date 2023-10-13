/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Persona implements Runnable {

    private Random r = new Random();
    private Piscina pileta;
    private String name;

    public Persona(Piscina p, String nombre) {
        this.pileta = p;
        this.name = nombre;
    }

    public void run() {
        this.pileta.entrar(this.name);
        this.disfrutar();
        this.pileta.salir(this.name);
    }

    public void disfrutar() {
        try {
            System.out.println(this.name+" Chapoteando");
            Thread.sleep(r.nextInt(5) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
