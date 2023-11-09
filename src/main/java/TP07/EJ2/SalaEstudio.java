/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class SalaEstudio {

    private int mesasDisponibles;
    private int mesasUsadas;
    private int maxMesas;

    public SalaEstudio(int maxMesa) {
        this.maxMesas = maxMesa;
        this.mesasUsadas = 0;
        this.mesasDisponibles = maxMesa;
    }

    public synchronized void usarMesa() {
        while (this.mesasUsadas >= this.maxMesas) {
                System.out.println("La sala esta llena por favor espera");
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SalaEstudio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.mesasUsadas++;
        this.mesasDisponibles--;
        System.out.println("Mesas usadas: "+this.mesasUsadas);
    }
    public synchronized void irse(){
        System.out.println("Un estudiante se va");
        this.mesasDisponibles++;
        this.mesasUsadas--;
        System.out.println("Mesas disponibles: "+this.mesasDisponibles);
        this.notify();
    }
}
