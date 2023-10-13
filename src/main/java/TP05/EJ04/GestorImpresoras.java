/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ04;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author jesus
 */
public class GestorImpresoras {

    private Impresora[] impresora;

    public GestorImpresoras(int cantidad) {
        this.impresora = new Impresora[cantidad];
        inicializar();
    }

    private void inicializar() {
        int longitud = this.impresora.length;
        for (int i = 0; i < longitud; i++) {
            this.impresora[i] = new Impresora();
        }
    }

    public void imprimir(String n) {
        boolean exito = false;
        int i = 0;
        int longitud = this.impresora.length;
        while (!exito) {
            if (i == longitud) {
                i = 0;
            }
            if (this.impresora[i].imprimir()) {
                simularImpresion(n);
                System.out.println(n + " Termina de imprimir");
                this.impresora[i].terminarImprimir();
                exito = true;
            }
            i++;

        }

    }

    private void simularImpresion(String nombre) {
        Random n = new Random();
        try {
            System.out.println(nombre + " Imprimiendo...");
            Thread.sleep(n.nextInt(10) * 1000);
        } catch (InterruptedException e) {

        }
    }
}
