/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04;

/**
 *
 * @author jesus
 */
public class ProcesoI implements Runnable {

    private Datos unD;

    public void run() {
        for (int i = 0; i < 10000; i++) {
            unD.incrementar();
        }
    }

    public ProcesoI(Datos d) {
        this.unD = d;
    }

}
