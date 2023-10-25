/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ5;

/**
 *
 * @author jesus
 */
public class VendedorTickets implements Runnable {

    Boleteria garita;

    public void run() {
            this.garita.vender();
    }

    public VendedorTickets(Boleteria garita) {
        this.garita = garita;
    }
}
