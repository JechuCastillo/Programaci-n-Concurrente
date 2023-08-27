/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class TesteoHilos {
    public static void main(String []args) throws InterruptedException{
        Thread  miHilo = new MiEjecucion();
        miHilo.start();
        System.out.println("En el main");
    }
}
