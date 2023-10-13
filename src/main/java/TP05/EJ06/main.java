/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ06;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Taxista taxista = new Taxista(taxi);
        Pasajero[] pasajero = new Pasajero[10];
        for (int i = 0; i < 10; i++) {
            pasajero[i] = new Pasajero("Pasajero " + String.valueOf(i), taxi);
        }

        Thread t = new Thread(taxista);
        Thread pasajeros[] = new Thread[10];
        for (int i = 0; i < 10; i++) {
            pasajeros[i]= new Thread(pasajero[i]);
        }
        
        t.start();
        for(int j = 0; j<10;j++){
            pasajeros[j].start();
        }
    }

}
