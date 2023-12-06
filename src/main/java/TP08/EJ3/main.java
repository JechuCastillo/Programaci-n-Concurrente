/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ3;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Heladera heladera = new Heladera(20, 20, 20);
        ChefPasta pasta = new ChefPasta(heladera);
        Ensaladero ensalada = new Ensaladero(heladera);
        Parrillero parrillada = new Parrillero(heladera);
        Repositor repositor = new Repositor(heladera);
        Thread hiloRepositor = new Thread(repositor);
        Thread hiloPasta = new Thread(pasta);
        Thread hiloEnsalada = new Thread(ensalada);
        Thread hiloParrilero = new Thread(parrillada);
        hiloRepositor.start();
        hiloEnsalada.start();
        hiloParrilero.start();
        hiloPasta.start();

    }
}
