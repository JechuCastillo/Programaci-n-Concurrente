/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ3;

/**
 *
 * @author jesus
 */
public class Repositor implements Runnable {

    private Heladera heladera;

    public Repositor(Heladera h) {
        this.heladera = h;
    }

    public void run() {
        while (true) {
            this.heladera.reponer();
        }
    }
}
