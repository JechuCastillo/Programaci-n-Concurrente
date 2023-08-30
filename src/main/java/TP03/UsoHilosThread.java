/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class UsoHilosThread extends Thread {

    public UsoHilosThread(String str) {
        super(str);
    }

    public void run() {
        System.out.println("Comenzando: " + getName());
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("En " + getName() + ", el recuento: " + i);
            }
        } catch (InterruptedException ex) {
            System.out.println(getName() + " Interrumpido.");
        }
        System.out.println("Terminando " + getName());
    }

    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        UsoHilosThread unHilo = new UsoHilosThread("#1");
        unHilo.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(" .");
        }
        try {
            Thread.sleep(100);
        }catch(InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado");
    }
}
