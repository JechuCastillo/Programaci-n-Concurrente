/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ02;

/**
 *
 * @author jesus
 */
public class Energy {

    private int energia = 10;

    public Energy() {

    }

    public int getEnergy() {
        return this.energia;
    }

    public synchronized void drenar() {
        this.setEnergia(this.getEnergy() - 3);
    }

    public synchronized void setEnergia(int n) {
        this.energia = n;
    }

    public synchronized void revitalizar() {
        this.setEnergia(this.getEnergy() + 3);
    }

}
