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

    private int delay;//Tiempo entre escritura
    private Dato miDato;
    private int miCta=0;

    public PingPong(String cartel, int cantMs) {
        super(cartel);
        this.delay = cantMs;
    }

    public PingPong(String cartel, int cantMs, Dato ddato) {
        this(cartel, cantMs);
        this.miDato = ddato;
    }

    public void run() {
        for (int i = 1; i < this.delay * 2; i++) {
            // System.out.println(this.cadena + " ");
            this.miCta++;
            this.miDato.contar();
        }
        System.out.println(this.miCta+ " veces " + this.getName());
    }

    public static void main(String[] args) {
        Dato cta = new Dato();
        PingPong t1 = new PingPong("PING", (int) (Math.random() * 2300), cta);
        PingPong t2 = new PingPong("PONG", (int) (Math.random() * 2000), cta);

        t1.start();
        t2.start();

        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            System.out.println("INTERRUMPIDO");
        }
        System.out.println(Thread.currentThread() + " chau-chau.adios");
        System.out.println(" dato " + cta.obtenerValor());
    }
}
