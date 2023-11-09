/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Mozo implements Runnable {

    private Comedor mesa;
    private Random n = new Random();

    public Mozo(Comedor m) {
        this.mesa = m;
    }

    public void run() {
        this.mesa.tomarPedidoBebida();
        buscarPedido();
        this.mesa.entregarBebida();
    }
    public void buscarPedido(){
        System.out.println("MOZO BUSCA PEDIDO");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
