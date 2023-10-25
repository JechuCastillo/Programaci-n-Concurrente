/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

/**
 *
 * @author jesus
 */
public class Mozo implements Runnable {

    private Comedor mesa;

    public Mozo(Comedor m) {
        this.mesa = m;
    }

    public void run() {
        this.mesa.tomarPedido();
        this.mesa.entregarBebida();
    }
}
