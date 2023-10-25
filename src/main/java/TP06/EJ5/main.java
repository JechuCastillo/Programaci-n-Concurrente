/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ5;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantPasajeros = 30;
        int cantAsientos = 10;
        Boleteria garita = new Boleteria();
        Pasajero pasajeros[] = new Pasajero[cantPasajeros];
        TrenTuristico tren = new TrenTuristico(cantAsientos);
        ControlTren controlador = new ControlTren(tren);
        Thread pasajero[] = new Thread[cantPasajeros];
        Thread control = new Thread(controlador);
        for (int i = 0; i < cantPasajeros; i++) {
            pasajeros[i] = new Pasajero(tren,garita);
            pasajero[i] = new Thread(pasajeros[i]);
            pasajero[i].start();
        }
        control.start();

    }

}
