/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Comedor {

    private Semaphore cocinero;
    private Semaphore mozo;
    private Semaphore mesa;
    private Semaphore pedido;

    public Comedor() {
        this.mesa = new Semaphore(2);
        this.mozo = new Semaphore(0);
        this.cocinero = new Semaphore(0);
        this.pedido = new Semaphore(1);
    }

    public void sentarse() {
        try {
            this.mesa.acquire();
        } catch (InterruptedException ex) {
        }
    }

    public void pedirBebida() {
        try {
            System.out.println("Solicitando bebida");
            this.mozo.release();
        } catch (InterruptedException ex) {
            
        }
    }

    public void pedirComida() {
        try {
            this.cocinero.release();
            System.out.println("Solicitando comida");
        } catch (InterruptedException ex) {

        }
    }

    public void irse() {
        this.mesa.release();
    }

    public void cocinar() {

    }

    public void tomarPedidoMozo() {
        try {
            this.pedido.acquire();
            System.out.println("MOZO TOMA PEDIDO");
            this.pedido.release();
        } catch (InterruptedException ex) {
        }
    }
    public void entregarPedido(){
        
    }
}
