/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ7;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        int cantPasajeros = 50;
        int cantAutomoviles = 50;
        int capacidadAutos = 10;
        int capacidadPasajeros = 10;
        Ferry elFerry = new Ferry(capacidadPasajeros, capacidadAutos);
        ControladorFerry control = new ControladorFerry();
        Pasajero p[] = new Pasajero[cantPasajeros];
        Automovil a[] = new Automovil[cantAutomoviles];
        Thread pasajero[] = new Thread[cantPasajeros];
        Thread automovil[] = new Thread[cantAutomoviles];
        for (int i = 0; i < cantPasajeros; i++) {
            p[i] = new Pasajero(elFerry);
            pasajero[i] = new Thread(p[i]);
            pasajero[i].start();
        }
        for (int i = 0; i < cantAutomoviles; i++) {
            a[i] = new Automovil(elFerry);
            automovil[i] = new Thread(a[i]);
            automovil[i].start();
        }

    }
}
