/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ02;

import java.util.concurrent.Semaphore;

/**
 *
 * @author jesus
 */
public class P1 implements Runnable {

    private RecursoCompartido semaforos;

    public P1(RecursoCompartido s) {
        this.semaforos = s;
    }

    public void run() {
        this.semaforos.adquirirDos();
        System.out.println("P1");
        this.semaforos.liberarUno();
    }

}
