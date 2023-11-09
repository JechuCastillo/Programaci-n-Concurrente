/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HamsterMonitor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class HamsterMonitor implements Runnable{

    private Plato plato;
    private Rueda rueda;
    private String nombre;

    public HamsterMonitor(String nombre, Plato plato, Rueda rueda) {
        this.plato = plato;
        this.rueda = rueda;
        this.nombre = nombre;
    }

    public void run() {
        while (true) {
            this.plato.empezarAComer(this.nombre);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HamsterMonitor.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.plato.terminarDeComer(nombre);
            this.rueda.rodar(this.nombre);
        }
    }
}
