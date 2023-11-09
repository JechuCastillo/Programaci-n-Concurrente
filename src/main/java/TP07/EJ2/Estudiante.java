/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
/**
 *
 * @author jesus
 */
public class Estudiante implements Runnable {
    private SalaEstudio sala;
    private String name;
    private Random n = new Random();
    public Estudiante(SalaEstudio s) {
        this.sala = s;
    }

    public void run() {
        this.sala.usarMesa();
        estudiar();
        this.sala.irse();
    }
    private void estudiar(){
        try {
            Thread.sleep((this.n.nextInt(3)+1)*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Estudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
