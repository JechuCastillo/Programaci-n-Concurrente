/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_CountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author jesus
 */
public class Muñeco {

    private Random n;
    private CountDownLatch latch;
    private int dañoLuz;
    private int dañoOscuridad;

    public Muñeco(CountDownLatch latch) {
        this.latch = latch;
        this.dañoLuz = 0;
        this.dañoOscuridad = 0;
        this.n= new Random();
    }

    public synchronized void ataqueLuz() {
        System.out.println("Ataca un personaje de luz");
        this.dañoLuz += n.nextInt(100)+1;
        System.out.println("L:" + this.dañoLuz);
        latch.countDown();
    }

    public synchronized void ataqueOscuridad() {
        System.out.println("Ataca un personaje de oscuridad");
        this.dañoOscuridad += n.nextInt(100)+1;
        System.out.println("O:" + this.dañoOscuridad);
        latch.countDown();
    }

    public synchronized void exponerGanador() {
        if (this.dañoLuz > this.dañoOscuridad) {
            System.out.println("HA GANADO LA LUZ\nDAÑO LUZ:" + this.dañoLuz + "\nDAÑO OSCURIDAD:" + this.dañoOscuridad);
        } else {
            System.out.println("HA GANADO LA OSCURIDAD\nDAÑO LUZ: " + this.dañoLuz + "\nDAÑO OSCURIDAD: " + this.dañoOscuridad);
        }
    }
}
