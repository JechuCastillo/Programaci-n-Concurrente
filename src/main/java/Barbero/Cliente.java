/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barbero;

/**
 *
 * @author jesus
 */
public class Cliente implements Runnable {

    private Sillon sillon;

    public Cliente(Sillon s) {
        this.sillon = s;
    }

    public void run() {
        sillon.usar();
        sillon.solicitarAtencion();
        sillon.meCortanElPelo();
        sillon.liberarSillon();
    }

}
