/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.formacionDeAgua;

/**
 *
 * @author jesus
 */
public class PruebaMain {

    public static void main(String[] args) {
        int cantH = 12;
        int cantO = 6;
        Recipiente recipiente = new Recipiente(3);
        AtomoHidrogeno hidrogeno[] = new AtomoHidrogeno[cantH];
        AtomoOxigeno oxigeno[] = new AtomoOxigeno[cantO];
        Thread hiloH[] = new Thread[cantH];
        Thread hiloO[] = new Thread[cantO];
        for (int i = 0; i < cantH; i++) {
            hidrogeno[i] = new AtomoHidrogeno(recipiente);
            hiloH[i] = new Thread(hidrogeno[i]);
            hiloH[i].start();
        }
        for (int i = 0; i < cantO; i++) {
            oxigeno[i] = new AtomoOxigeno(recipiente);
            hiloO[i] = new Thread(oxigeno[i]);
            hiloO[i].start();
        }
    }
}
