/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Cocinero implements Runnable {

    private Comedor mesa;

    public Cocinero(Comedor m) {
        this.mesa = m;
    }

    public void run() {
        this.mesa.tomarPedidoCocinero();
        cocinar();
        this.mesa.entregarPedido();
    }

    public void cocinar() {
        try {
            System.out.println("El cocinero cocina");
            Thread.sleep(3000);

        } catch (InterruptedException ex) {
            Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
