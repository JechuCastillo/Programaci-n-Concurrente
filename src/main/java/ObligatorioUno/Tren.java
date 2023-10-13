/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioUno;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Tren {

    private int asientos;
    private int asientosDisponibles;
    private Semaphore controlador;
    private Semaphore subir;
    private Semaphore bajar;

    public Tren(int asientos) {
        this.asientosDisponibles = asientos;
        this.controlador = new Semaphore(1);
        this.bajar = new Semaphore(0);
        this.subir = new Semaphore(0);
    }

    public void subir() {
        this.asientosDisponibles--;
    }

    public void bajar() {
        this.asientosDisponibles++;
    }
}
