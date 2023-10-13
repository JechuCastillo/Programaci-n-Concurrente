/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ07;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Turno turno = new Turno();
        Impresora A = new Impresora("A", turno, 1,1);
        Impresora B = new Impresora("B", turno, 2,2);
        Impresora C = new Impresora("C", turno, 1,3);
        Thread a = new Thread(A);
        Thread b = new Thread(B);
        Thread c = new Thread(C);
        a.start();
        b.start();
        c.start();
    }
}
