/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ7;

/**
 *
 * @author jesus
 */
public class ControladorFerry implements Runnable {

    private Ferry ferry;

    public void run() {
        while (true) {
            this.ferry.iniciarRecorrido();
            this.ferry.finalizarRecorrido();
        }
    }

}
