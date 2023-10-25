/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Random n = new Random();
        while (true) {
            System.out.println("Numeros entre " + n.nextInt(2));
        }
    }
}
