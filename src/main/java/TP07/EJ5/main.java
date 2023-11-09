/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ5;

import TP07.EJ4.*;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Buffer b = new Buffer(10);
        int cantProductores = 10;
        int cantConsumidores = 3;
        Productor p[] = new Productor[cantProductores];
        Consumidor c[] = new Consumidor[cantConsumidores];
        Thread productor[] = new Thread[cantProductores];
        Thread consumidor[] = new Thread[cantConsumidores];
        for (int i = 0; i < cantProductores; i++) {
            p[i] = new Productor(b,"PRODUCTOR "+i);
            productor[i] = new Thread(p[i]);
            productor[i].start();
        }
        for (int i = 0; i < cantConsumidores; i++) {
            c[i] = new Consumidor(b,"Consumidor "+i);
            consumidor[i] = new Thread(c[i]);
            consumidor[i].start();
        }

    }
}
