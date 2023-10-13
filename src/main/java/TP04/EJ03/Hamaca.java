/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ03;

/**
 *
 * @author jesus
 */
public class Hamaca {
    public Hamaca(){
    }
    public synchronized void dormir(Hamster h)throws InterruptedException{
        System.out.println(h.getNombre()+ " ESTA DURMIENDO");
        Thread.sleep(3000);
        System.out.println(h.getNombre()+" TERMINO DE DORMIR");
    }
}
