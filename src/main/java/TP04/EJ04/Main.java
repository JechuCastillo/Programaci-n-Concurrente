/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ04;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Actividad uno = new Actividad("MUSEO", 2);
        Actividad dos = new Actividad("ILUMINACION", 2);
        Actividad tres = new Actividad("Tres", 2);
        Actividad[] a = new Actividad[3];
        a[0] = uno;
        a[1] = dos;
        a[2] = tres;
        AgenteParque a1 = new AgenteParque("A", a, 1, "MUSEO");
        AgenteParque a2 = new AgenteParque("B", a, 1, "iluminacion");
        AgenteParque a3 = new AgenteParque("C", a, 0, "MUSEO");
        Thread h1 = new Thread(a1);
        Thread h2 = new Thread(a2);
        Thread h3 = new Thread(a3);
        
        h1.start();
        h2.start();
        h3.start();
    }
}
