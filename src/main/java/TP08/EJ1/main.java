/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ1;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantPersonas = 60;
        GestorSala sala = new GestorSala();
        Persona p[] = new Persona[cantPersonas];
        MedidorTemperatura medidor = new MedidorTemperatura(sala);
        Thread medidorTemperatura = new Thread(medidor);
        for (int i = 0; i < cantPersonas; i++) {
            p[i] = new Persona("Persona " + i, sala, i + 30);
        }
        Thread persona[] = new Thread[cantPersonas];
        for (int i = 0; i < cantPersonas; i++) {
            persona[i] = new Thread(p[i]);
            persona[i].start();
        }
        medidorTemperatura.start();

    }
}
