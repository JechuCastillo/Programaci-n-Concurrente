/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

/**
 *
 * @author jesus
 */
public class Contador {

    public static void main(String[] args) {
        final Dato unContador = new Dato();
        RunnableCdor unRunCdor = new RunnableCdor(unContador);
        Thread h1 = new Thread(unRunCdor);
        Thread h2 = new Thread(unRunCdor);
        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
        }
        System.out.println("En el main: " + unContador.obtenerValor());
    }
}
