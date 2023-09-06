/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04;

/**
 *
 * @author jesus
 */
public class Datos {

    private int dato;

    public Datos(int nro) {
        this.dato = nro;
    }

    public int getDato() {
        return this.dato;
    }

    public void setDato(int n) {
        this.dato = n;
    }

    public void incrementar() {
        this.setDato(this.getDato()+1);
    }

    public void set(int valor) throws InterruptedException {
        this.dato = valor;
    }
}
