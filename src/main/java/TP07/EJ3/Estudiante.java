/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author jesus
 */
public class Estudiante implements Runnable {

    private SalaEstudio sala;
    private Random n = new Random();

    public Estudiante(SalaEstudio sala) {
        this.sala = sala;
    }

    public void run() {
        this.sala.usarMesa();
        estudiar();
        this.sala.irse();
    }

    private void estudiar() {
        System.out.println("Estudiando...");
        try {
            Thread.sleep((this.n.nextInt(2) + 1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
