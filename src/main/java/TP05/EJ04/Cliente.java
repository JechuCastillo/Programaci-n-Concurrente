/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ04;

import java.util.concurrent.Semaphore;

/**
 *
 * @author jesus
 */
public class Cliente implements Runnable {

    private GestorImpresoras gestor;
    private String nombre;

    public Cliente(String n, GestorImpresoras gestor) {
        this.gestor = gestor;
        this.nombre = n;
    }

    public void run() {
        this.gestor.imprimir(this.nombre);
    }
}
