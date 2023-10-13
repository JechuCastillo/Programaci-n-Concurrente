/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ02;

/**
 *
 * @author jesus
 */
public class P2 implements Runnable {

    private RecursoCompartido sem;

    public P2(RecursoCompartido s) {
        this.sem = s;
    }

    public void run() {
        this.sem.adquirirTres();
        System.out.println("Estamos en P2");
        this.sem.liberarDos();
    }
}
