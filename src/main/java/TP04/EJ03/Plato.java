/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ03;

/**
 *
 * @author jesus
 */
public class Plato {
    public Plato(){
    }
    public synchronized void comer(Hamster h) throws InterruptedException{
        System.out.println(h.getNombre()+" ESTA COMIENDO");
        Thread.sleep(2000);
        System.out.println(h.getNombre()+" TERMINO DE COMER");
    }
    
}
