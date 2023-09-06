/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

/**
 *
 * @author jesus
 */
public class Dato {

    private int valor;

    public synchronized void contar() {
        this.valor = ++this.valor;
    }

    public int obtenerValor() {
        return this.valor;
    }

}
