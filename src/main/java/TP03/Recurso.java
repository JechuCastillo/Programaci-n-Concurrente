/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class Recurso {
    static void uso(){
        Thread t = Thread.currentThread();
        System.out.println("En recurso: Soy "+t.getName());
    }
}
