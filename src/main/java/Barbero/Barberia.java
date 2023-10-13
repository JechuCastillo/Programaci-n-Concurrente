/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barbero;

/**
 *
 * @author jesus
 */
public class Barberia {

    public static void main(String[] args) {
        Sillon s = new Sillon();
        Cliente c1, c2, c3;
        
        Barbero b = new Barbero(s);
        Thread barbero = new Thread(b);
        c1 = new Cliente(s);
        c2 = new Cliente(s);
        c3 = new Cliente(s);
        System.out.println("Barbero espera un cliente");
        barbero.start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        

    }
}
