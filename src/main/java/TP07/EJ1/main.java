/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ1;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantNorte = 4;
        int cantSur = 2;
        PuenteEstrecho p = new PuenteEstrecho(cantSur, cantNorte);
        AutoNorte autoNorte[] = new AutoNorte[cantNorte];
        AutoSur autoSur[] = new AutoSur[cantSur];
        Thread hiloAutoNorte[] = new Thread[cantNorte];
        Thread hiloAutoSur[] = new Thread[cantSur];
        for (int i = 0; i < cantSur; i++) {
            autoSur[i] = new AutoSur(p);
            hiloAutoSur[i] = new Thread(autoSur[i]);
            hiloAutoSur[i].start();
        }

        for (int i = 0; i < cantNorte; i++) {
            autoNorte[i] = new AutoNorte(p);
            hiloAutoNorte[i] = new Thread(autoNorte[i]);
            hiloAutoNorte[i].start();
        }
    }
}
