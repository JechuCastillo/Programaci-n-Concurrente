/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ06;

/**
 *
 * @author jesus
 */
public class Suma implements Runnable {

    private int[] a;
    private static int resultado = 0;
    private int posInicio;
    private int posFin;

    public void run() {
        this.sumar();
    }

    public Suma(int[] arr, int posInicio, int posFin) {
        this.a = arr;
        this.posInicio = posInicio;
        this.posFin = posFin;
    }

    private synchronized void actualizarResultado(int r) {
        this.resultado = this.getResultado() + r;
    }

    private synchronized int getResultado() {
        return this.resultado;
    }

    private void sumar() {
        int s = 0;
        for (int i = this.posInicio; i <= this.posFin; i++) {
            s += this.a[i];
        }
        System.out.println("RESULTADO DESDE " + this.posInicio + " HASTA " + this.posFin + ": " + s);
        this.actualizarResultado(s);
    }

    public static int resultadoFinal() {
        return Suma.resultado;
    }
}
