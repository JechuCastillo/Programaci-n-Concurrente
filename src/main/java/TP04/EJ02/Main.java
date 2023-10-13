/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ02;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        Energy energ = new Energy();
        CriaturaOscura n = new CriaturaOscura(energ, "CRIATURA");
        Sanador s = new Sanador("SANADOR", energ);
        Thread h1 = new Thread(n);
        Thread h2 = new Thread(s);
        System.out.println("ENERGIA ANTES DE COMENZAR:"+energ.getEnergy());
        h1.start();
        h2.start();
    }
}
