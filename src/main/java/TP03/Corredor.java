/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Corredor extends Thread {

    int distanciaRecorrida;

    public Corredor(String s) {
        super(s);
        this.distanciaRecorrida = 0;
    }

    public int getPasos() {
        return this.distanciaRecorrida;
    }

    public void avanzar() {
        Random n = new Random();
        int avance = n.nextInt(10);
        this.distanciaRecorrida += avance;
    }

    public int getDistancia() {
        return this.distanciaRecorrida;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            avanzar();
            System.out.println(getName() + " recorrio:" + this.distanciaRecorrida + " PASOS");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Corredor interrumpido");
            }
        }
        System.out.println("CORREDOR: " + getName() + " FINALIZO LA CARRERA.");
    }

    public static void main(String[] args) {
        Corredor[] corredores = new Corredor[3];
        corredores[0] = new Corredor("Celi");
        corredores[1] = new Corredor("Facu");
        corredores[2] = new Corredor("Jechu");
        for (Corredor c : corredores) {
            c.start();
        }
        try {
            for (Corredor c : corredores) {
                c.join();
            }

        } catch (InterruptedException ex) {
            System.out.println("CORREDOR INTERRUMPIDO");
        }
        Corredor mayor = corredores[0];
        for (Corredor c : corredores) {
            if (c.distanciaRecorrida > mayor.distanciaRecorrida) {
                mayor = c;
            }
        }
        System.out.println("CARRERA FINALIZADA");
        System.out.println("EL CORREDOR QUE HIZO LA MAYOR DISTANCIA ES: "+mayor.getName());

    }

}
