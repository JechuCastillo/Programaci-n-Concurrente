/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ03;

/**
 *
 * @author jesus
 */
public class P3 implements Runnable {

    private SemaforosProcesos s;

    public P3(SemaforosProcesos p) {
        this.s = p;
    }

    public void run() {
        while (true) {
            this.s.adquirirTres();
            System.out.println("ESTAMOS EN P3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            this.s.liberarDos();
        }
    }
}
