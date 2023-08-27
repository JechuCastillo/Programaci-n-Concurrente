/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class TestRunneable {

    public static void main(String[] args) {
        RunneableEjemplo n = new RunneableEjemplo("Maria Jose");
        RunneableEjemplo m = new RunneableEjemplo("Maria Jose");

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
        
        
    }
}
