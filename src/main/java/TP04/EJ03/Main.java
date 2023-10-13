/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ03;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Plato p = new Plato();
        Rueda r = new Rueda();
        Hamaca h = new Hamaca();
        Hamster h1 = new Hamster("EMMA", p, r, h);
        Hamster h2 = new Hamster("NATI", p, r, h);
        Hamster h3 = new Hamster("Jechu", p, r, h);

        Thread emma = new Thread(h1);
        Thread jechu = new Thread(h2);
        Thread nati = new Thread(h3);
        emma.start();
        jechu.start();
        nati.start();
    }
}
