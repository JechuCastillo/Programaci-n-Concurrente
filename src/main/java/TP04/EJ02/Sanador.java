/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ02;

/**
 *
 * @author jesus
 */
public class Sanador implements Runnable {

    private Energy energia;
    private String cadena;

    public Sanador(String c, Energy n) {
        this.energia = n;
        this.cadena = c;
    }

    public void run() {
        while (this.energia.getEnergy() > 0) {
            try {
                this.energia.revitalizar();
                System.out.println("ENERGIA CURADA: " + this.energia.getEnergy());
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
