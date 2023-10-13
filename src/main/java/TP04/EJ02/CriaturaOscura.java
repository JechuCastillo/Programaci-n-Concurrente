/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ02;

/**
 *
 * @author jesus
 */
public class CriaturaOscura implements Runnable {

    private Energy energia;
    private String cadena;

    public CriaturaOscura(Energy n, String cadena) {
        this.energia = n;
        this.cadena = cadena;
    }

    public void run() {
        while (this.energia.getEnergy() > 0) {
            try {
                this.energia.drenar();
                System.out.println("La criatura ha atacado: " + this.energia.getEnergy());
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
