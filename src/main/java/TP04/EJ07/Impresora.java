/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ07;

/**
 *
 * @author jesus
 */
public class Impresora implements Runnable {

    private Turno turno;
    private int cantidad;
    private String letra;
    int pos;

    public Impresora(String l, Turno turno, int cantidad, int pos) {
        this.letra = l;
        this.turno = turno;
        this.cantidad = cantidad;
        this.pos = pos;
    }

    public void run() {
        while (true) {
            if (turno.getTurno() == pos) {
                for (int i = 1; i <= this.cantidad; i++) {
                    this.turno.imprimir(letra);
                }
                this.turno.setTurno(turno.getTurno() + 1);
                if (this.turno.getTurno() > 3) {
                    this.turno.setTurno(1);
                }
            }
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
            }
        }
    }

}
