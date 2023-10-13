/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ02;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        RecursoCompartido s = new RecursoCompartido();
        P1 p1 = new P1(s);
        P2 p2 = new P2(s);
        P3 p3 = new P3(s);
        P4 p4 = new P4(s);

        Thread h1 = new Thread(p1);
        Thread h2 = new Thread(p2);
        Thread h3 = new Thread(p3);
        Thread h4 = new Thread(p4);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
