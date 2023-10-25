/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ4;

import TP06.EJ3.*;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantPerros = 3;
        int cantGatos = 6;
        int comederos = 3;
        Perro perritos[] = new Perro[cantPerros];
        Gato gatitos[] = new Gato[cantGatos];
        Comedor unComedor = new Comedor(comederos, cantPerros, cantGatos);
        Thread perros[] = new Thread[cantPerros];
        Thread gatos[] = new Thread[cantGatos];
        for (int i = 0; i < cantPerros; i++) {
            perritos[i] = new Perro(unComedor);
            perros[i] = new Thread(perritos[i]);
            perros[i].start();
        }
        for (int i = 0; i < cantGatos; i++) {
            gatitos[i] = new Gato(unComedor);
            gatos[i] = new Thread(gatitos[i]);
            gatos[i].start();
        }

    }
}
