/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ04;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {

        
        GestorImpresoras gestor = new GestorImpresoras(4);
        Cliente[] c = new Cliente[8];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Cliente("Cliente " + Integer.toString(i + 1), gestor);
        }
        Thread hilos[] = new Thread[8];
        for (int i = 0; i < 8; i++) {
            hilos[i] = new Thread(c[i]);
        }
        for (int i = 0; i < 8; i++) {
            hilos[i].start();
        }

    }
}
