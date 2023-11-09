/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Empleado implements Runnable {

    private Comedor mesa;
    private Random n = new Random();
    private String nombre;

    public void run() {
        //sentarse;
        //Pedir de comer y/o beber
        //comer y/o tomar
        //salir
        this.mesa.sentarse();
        this.mesa.pedirBebida(this.nombre);
        this.mesa.beber();
        beber();
        this.mesa.irse(this.nombre);
    }
    private void beber(){
        System.out.println("EL EMPLEADO BEBE");
    }
    public Empleado(Comedor m, String nombre) {
        this.mesa = m;
        this.nombre = nombre;
    }

    
}
