/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04;

/**
 *
 * @author jesus
 */
public class Contador {

    public static void main(String[] args) {
        Datos contador = new Datos(0);
        ProcesoI p1 = new ProcesoI(contador);
        ProcesoI p2 = new ProcesoI(contador);

        Thread h1 = new Thread(p1);
        Thread h2 = new Thread(p2);
        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrumpido");
        }
        System.out.println("En main " + contador.getDato());
    }
}
