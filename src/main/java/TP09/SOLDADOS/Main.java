/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.SOLDADOS;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        int cantSoldados = 500;
        int capacidad = 100;
        int cantMostradoresAlmuerzo = 5;
        int cantMostradoresPostre = 3;
        int cantAbridores = 10;
        Comedor comedor = new Comedor(capacidad, cantMostradoresAlmuerzo, cantMostradoresPostre, cantAbridores);
        Soldado soldado[] = new Soldado[cantSoldados];
        Thread hiloSoldado[] = new Thread[cantSoldados];
        for (int i = 0; i < cantSoldados; i++) {
            soldado[i] = new Soldado(comedor);
            hiloSoldado[i] = new Thread(soldado[i]);
            hiloSoldado[i].start();
        }
    }
}
