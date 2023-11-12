/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.OBSERVATORIO;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Investigador implements Runnable {

    private Observatorio observatorio;

    public void run() {
        this.observatorio.entrarInvestigador();
        guardarInvestigaciones();
        this.observatorio.salirInvestigador();
    }

    private void guardarInvestigaciones() {
        System.out.println("El investigador hace sus observaciones");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Investigador.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Concluye y las guarda");
    }

    public Investigador(Observatorio obs) {
        this.observatorio = obs;
    }

}
