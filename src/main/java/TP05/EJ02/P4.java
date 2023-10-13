/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ02;

/**
 *
 * @author jesus
 */
public class P4 implements Runnable {

    private RecursoCompartido sem;

    public P4(RecursoCompartido s) {
        this.sem = s;
    }

    public void run() {
        this.sem.adquirirCuatro();
        System.out.println("ESTAMOS EN P4");
    }
}
