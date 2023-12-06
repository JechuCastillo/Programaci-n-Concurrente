/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.ParqueConcurrido;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantidad = 40;
        Persona persona[] = new Persona[cantidad];
        Parque parque = new Parque(10);
        Thread hiloPersona[] = new Thread[cantidad];
        for (int i = 0; i < cantidad; i++) {
            persona[i] = new Persona(parque);
            hiloPersona[i] = new Thread(persona[i]);
            hiloPersona[i].start();
        }
    }
}
