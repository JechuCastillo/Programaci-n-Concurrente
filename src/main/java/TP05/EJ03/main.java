/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ03;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        SemaforosProcesos p = new SemaforosProcesos();
        P1 p1 = new P1(p);
        P2 p2 = new P2(p);
        P3 p3 = new P3(p);
        Thread h1 = new Thread(p1);
        Thread h2 = new Thread(p2);
        Thread h3 = new Thread(p3);
        h1.start();
        h2.start();
        h3.start();
    }
}
