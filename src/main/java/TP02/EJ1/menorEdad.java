/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

/**
 *
 * @author jesus
 */
class menorEdad extends Exception {

    public menorEdad(String mensaje) {
        super(mensaje);
    }

    public static void menorDeEdad(int edad) throws menorEdad {
        if (edad < 18) {
            throw new menorEdad("Es menor de edad");
        }
    }
}
