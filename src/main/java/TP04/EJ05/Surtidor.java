/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ05;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Surtidor {

    private int litros = 200;

    public Surtidor() {
    }

    public synchronized void cargarCombustible(Auto a) {
        if (this.getLitros() >= 10) {
            System.out.println(a.getPatente() + " CARGANDO COMBUSTIBLE");
            try {
                Thread.sleep(1000);
                this.setLitros();
                System.out.println(a.getPatente() + " TERMINO DE CARGAR");
                System.out.println("QUEDAN: " + this.getLitros() + " EN EL SURTIDOR");
            } catch (InterruptedException e) {
            }
        }else{
            System.out.println("NO HAY SUFICIENTE COMBUSTIBLE EN EL SURTIDOR");
        }
        
    }

    public synchronized int getLitros() {
        return litros;
    }

    public synchronized void setLitros() {
        Random n = new Random();
        this.litros = this.getLitros() - n.nextInt(10);
    }

}
