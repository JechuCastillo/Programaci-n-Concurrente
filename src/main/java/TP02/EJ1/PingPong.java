/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

/**
 *
 * @author jesus
 */
public class PingPong extends Thread {

    private String cadena; //Lo que va a escribir
    private int delay;//Tiempo entre escritura

    public PingPong(String cartel, int cantMs) {
        this.cadena = cartel;
        delay = cantMs;
    }

    public void run() {
        for (int i = 0; i < this.delay * 10; i++) {
            System.out.println(this.cadena + " ");
            try {
                Thread.sleep(this.delay);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING", 33);
        PingPong t2 = new PingPong("PONG", 10);
        t1.start();
        t2.start();
        
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
        
        }
    }
}
