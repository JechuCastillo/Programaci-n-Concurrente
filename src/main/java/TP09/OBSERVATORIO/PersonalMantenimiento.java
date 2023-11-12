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
public class PersonalMantenimiento implements Runnable {

    private Observatorio observatorio;

    public PersonalMantenimiento(Observatorio observatorio) {
        this.observatorio = observatorio;
    }

    public void run() {
        this.observatorio.entrarMantenimiento();
        limpiar();
        this.observatorio.salirMantenimiento();
    }

    private void limpiar() {
        System.out.println("Empleado limpia la sala");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PersonalMantenimiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Empleado termina de limpiar la sala");
    }
}
