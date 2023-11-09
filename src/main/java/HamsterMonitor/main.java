/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HamsterMonitor;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Plato plato = new Plato(3);
        Rueda r = new Rueda();
        int cantHamster = 20;
        HamsterMonitor hamster[] = new HamsterMonitor[cantHamster];
        Thread hiloHamster[] = new Thread[cantHamster];
        for (int i = 0; i < cantHamster; i++) {
            hamster[i] = new HamsterMonitor("Hamster " + i, plato, r);
            hiloHamster[i] = new Thread(hamster[i]);
            hiloHamster[i].start();
        }
    }
}
