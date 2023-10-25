/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Empleado implements Runnable {

    private Mesa mesa;

    public void run() {
        Random n = new Random();
        int decision = n.nextInt(3);
        this.mesa.sentarse();
        if (decision == 0) {
            this.mesa.pedirBebida();
        } else if (decision == 1) {
            this.mesa.pedirComida();
        } else {
            this.mesa.pedirBebida();
            this.mesa.pedirComida();
        }
    }

    public Empleado(Mesa m) {
        this.mesa = m;
    }
}
