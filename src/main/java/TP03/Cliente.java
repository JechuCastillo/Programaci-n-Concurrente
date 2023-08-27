/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class Cliente extends Thread {
    public void run(){
        System.out.println("Soy "+Thread.currentThread().getName());
        Recurso.uso();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            
        }
    }
}
