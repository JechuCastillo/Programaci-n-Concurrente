/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class RunneableEjemplo implements Runnable {

    private String cadena;

    public RunneableEjemplo(String cad) {
        this.cadena = cad;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.cadena);
        }
        System.out.println("Termina Thread" + this.cadena);
    }
}
