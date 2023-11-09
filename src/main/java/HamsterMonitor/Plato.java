/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HamsterMonitor;

import java.util.jar.Attributes;

/**
 *
 * @author jesus
 */
public class Plato {

    private int cantidad;
    private int comiendo;

    public Plato(int maximo) {
        this.cantidad = maximo;
        this.comiendo = 0;
    }

    public synchronized void empezarAComer(String name) {
        try {
            while (this.comiendo >= 3) {
                System.out.println(name + "");
                this.wait();
            }
        } catch (InterruptedException a) {
            System.out.println(name + " empieza a comer");
            this.comiendo++;
        }
    }

    public synchronized void terminarDeComer(String name) {
        System.out.println(name + " termino de comer y se va");
        this.comiendo--;
        this.notify();
    }
}
