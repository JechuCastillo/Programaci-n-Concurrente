/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ03;

/**
 *
 * @author jesus
 */
public class P2 implements Runnable {

    private SemaforosProcesos s;

    public P2(SemaforosProcesos p) {
        this.s = p;
    }

    @Override
    public void run() {
        while (true) {
            this.s.adquirirDos();
            System.out.println("ESTAMOS EN P2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            this.s.liberarUno();
        }
    }
}
