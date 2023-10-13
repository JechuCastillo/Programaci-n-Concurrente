/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ06;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class MainSinSuma {

    public static void main(String[] args) {
        int a[] = new int[50000];
        Random n = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = n.nextInt(10);
        }
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        System.out.println("RESULTADO FINAL: "+resultado);
    }
}
