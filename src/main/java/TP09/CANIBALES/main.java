/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.CANIBALES;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantCanibales = 30;
        int raciones = 5;

        OllaComun olla = new OllaComun(raciones);
        Canibal canibales[] = new Canibal[cantCanibales];
        Cocinero cocinero = new Cocinero(olla);
        Thread hiloCanibal[] = new Thread[cantCanibales];
        Thread hiloCocinero = new Thread(cocinero);
        for (int i = 0; i < cantCanibales; i++) {
            canibales[i] = new Canibal(olla);
            hiloCanibal[i] = new Thread(canibales[i]);
            hiloCanibal[i].start();
        }
        hiloCocinero.start();
    }
}
