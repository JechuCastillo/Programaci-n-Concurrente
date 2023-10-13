/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ07;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Mesa m = new Mesa();
        Mozo mozo = new Mozo(m);
        Empleado[] emp = new Empleado[20];
        Thread mzo = new Thread(mozo);
        for (int i = 0; i < 20; i++) {
            emp[i] = new Empleado("Empleado" + String.valueOf(i), m);
        }
        Thread empleados[] = new Thread[20];
        for (int i = 0; i < 20; i++) {
            empleados[i] = new Thread(emp[i]);
        }
        mzo.start();
        for (int i = 0; i < 20; i++) {
            empleados[i].start();
        }
    }
}
