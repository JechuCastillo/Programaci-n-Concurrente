/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ07;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Empleado implements Runnable {

    private String nombre;
    private Mesa mesa;
    private Random r = new Random();

    public Empleado(String e, Mesa m) {
        this.nombre = e;
        this.mesa = m;
    }

    public void run() {
        this.mesa.sentarse(this.nombre);
        this.comer();
        this.mesa.irse(this.nombre);
    }

    public void comer() {
        try {
            System.out.println(this.nombre+" ESTA COMIENDO");
            Thread.sleep(r.nextInt(10)*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
