/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03.EJ07;

/**
 *
 * @author jesus
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;

    public Cliente(String n, int[] compras) {
        this.nombre = n;
        this.carroCompra = compras;
    }

    public String getName() {
        return this.nombre;
    }

    public int[] getCarroCompra() {
        return this.carroCompra;
    }
}
