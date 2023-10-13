/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ07;

/**
 *
 * @author jesus
 */
public class Turno {

    private int t=1;

    public Turno() {
    }

    public synchronized int getTurno() {
        return this.t;
    }

    public synchronized void setTurno(int t) {
        this.t = t;
    }

    public synchronized void imprimir(String c) {
        System.out.print(c);
    }
}
