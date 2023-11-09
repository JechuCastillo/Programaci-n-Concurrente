/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP06.EJ2;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Random n = new Random();
        int cantEmpleado = 10;
        Comedor m = new Comedor();
        Cocinero cocinero = new Cocinero(m);
        Empleado empleado[] = new Empleado[cantEmpleado];
        Mozo mozo = new Mozo(m);

        for (int i = 0; i < cantEmpleado; i++) {
            empleado[i] = new Empleado(m, "EMPLEADO " + i);
        }
        Thread chef = new Thread(cocinero);
        Thread camarero = new Thread(mozo);
        camarero.start();
        chef.start();
        Thread empleados[] = new Thread[cantEmpleado];
        for (int i = 0; i < cantEmpleado; i++) {
            empleados[i] = new Thread(empleado[i]);
            empleados[i].start();
        }
    }
}
