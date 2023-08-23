/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class Aeropuerto {

    private Alquiler[] alquileres;

    public Aeropuerto(Alquiler[] alq) {
        this.alquileres = alq;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler[] alquileres) {
        this.alquileres = alquileres;
    }
    
    public double calcularValorAlquiler(int pos){
        return alquileres[pos].calcularValor();
    }
    
}
