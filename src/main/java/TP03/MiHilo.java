/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class MiHilo implements Runnable {

    String nombreHilo;

    MiHilo(String nombre) {
        this.nombreHilo = nombre;
    }

    public void run() {
        System.out.println("Comenzando " + this.nombreHilo);
        try {
            for (int contar = 0; contar < 10; contar++) {
                Thread.sleep(400);
                System.out.println("En " + this.nombreHilo + ", el recuento: " + contar);
            }
        } catch (InterruptedException exc) {
            System.out.println(this.nombreHilo + " Interrumpido.");
        }
        System.out.println("Terminado " + nombreHilo);
    }
}
