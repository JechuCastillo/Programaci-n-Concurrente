/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ06;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Random n = new Random();
        int[] a = new int[50000];
        for (int i = 0; i < a.length; i++) {
            a[i] = n.nextInt(10);
        }
        Suma s1 = new Suma(a, 0, 10000);
        Suma s2 = new Suma(a, 10001, 20000);
        Suma s3 = new Suma(a, 20001, 30000);
        Suma s4 = new Suma(a, 30001, 40000);
        Suma s5 = new Suma(a, 40001, 49999);
        Thread h1 = new Thread(s1);
        Thread h2 = new Thread(s2);
        Thread h3 = new Thread(s3);
        Thread h4 = new Thread(s4);
        Thread h5 = new Thread(s5);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException ex) {
            System.out.println("INTERRUMPIDO");
        }
        System.out.println("El resultado es: "+Suma.resultadoFinal());
    }
}
