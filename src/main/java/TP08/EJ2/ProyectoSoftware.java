/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author jesus
 */
public class ProyectoSoftware {

    private int cantidadPortatiles;
    private int cantidadLibros;
    private ReentrantLock tomarRecursos;
    private Condition hayRecursos;

    public ProyectoSoftware(int libros, int notebooks) {
        this.cantidadLibros = libros;
        this.cantidadPortatiles = notebooks;
        this.tomarRecursos = new ReentrantLock(true);
        this.hayRecursos = tomarRecursos.newCondition();
    }

}
