/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.CANIBALES;

/**
 *
 * @author jesus
 */
public class Canibal implements Runnable {

    private OllaComun olla;

    public void run() {
        this.olla.servirse();
    }

    public Canibal(OllaComun olla) {
        this.olla = olla;
    }

    private void comer() {
    }
}
