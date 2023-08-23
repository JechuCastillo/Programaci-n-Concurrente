/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

import java.util.Random;

/**
 *
 * @author jesus
 */
class Ruleta extends Exception {

    public Ruleta(String mensaje) {
        super(mensaje);
    }

    public static void jugar(int n) throws Ruleta {
        Random r = new Random();
        int num = r.nextInt(3);
        if (n != num) {
            throw new Ruleta("Salio el numero: " + num);
        }
    }
}
