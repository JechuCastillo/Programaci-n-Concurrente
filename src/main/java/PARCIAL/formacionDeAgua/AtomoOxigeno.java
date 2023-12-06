/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.formacionDeAgua;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class AtomoOxigeno implements Runnable {

    private Recipiente recipiente;
    private Random n = new Random();

    public void run() {
        System.out.println("Un atomo de Oxigeno vaga por el espacio");
        try {
            Thread.sleep(n.nextInt(3) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AtomoOxigeno.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.recipiente.Olisto();
        this.recipiente.hacerAgua();
    }

    public AtomoOxigeno(Recipiente r) {
        this.recipiente = r;
    }

}
