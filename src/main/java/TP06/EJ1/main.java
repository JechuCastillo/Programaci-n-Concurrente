/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ1;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Piscina p = new Piscina(20);
        String nombres[] = new String[30];
        GestorPiscina gestor = new GestorPiscina(p);
        Persona[] persona = new Persona[30];
        for (int i = 0; i < 30; i++) {
            nombres[i] = "Persona " + String.valueOf(i);
        }
        for (int j = 0; j < 30; j++) {
            persona[j] = new Persona(p, nombres[j]);
        }
        Thread personas[] = new Thread[30];
        Thread g = new Thread(gestor);
        for (int k = 0; k < 30; k++) {
            personas[k] = new Thread(persona[k]);
        }
        g.start();
        for (int i = 0; i < 30; i++) {
            personas[i].start();
        }
    }
}
