/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ05;

/**
 *
 * @author jesus
 */
public class Estacion {

    public static void main(String[] args) {
        Surtidor s = new Surtidor();
        Auto a1 = new Auto("Audi", 2020, 10000, "AUTO 1", s);
        Auto a2 = new Auto("Peugeot", 2020, 10000, "AUTO 2", s);
        Auto a3 = new Auto("Volkswagen", 2020, 10000, "AUTO 3", s);
        Auto a4 = new Auto("Honda", 2020, 10000, "AUTO 4", s);
        Auto a5 = new Auto("Lambo", 2020, 10000, "AUTO 5", s);
        Thread h1 = new Thread(a1);
        Thread h2 = new Thread(a2);
        Thread h3 = new Thread(a3);
        Thread h4 = new Thread(a4);
        Thread h5 = new Thread(a5);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

    }
}
