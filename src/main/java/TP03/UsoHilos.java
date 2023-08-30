/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03;

/**
 *
 * @author jesus
 */
public class UsoHilos {

    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        //Primero construye un objeto MiHilo
        MiHilo mh = new MiHilo("#1");

        //Luego construye un hilo de ese objeto
        Thread nuevoHilo = new Thread(mh);

        //Finalmente, comienza la ejecucion del hilo
        nuevoHilo.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(" .");
        }
        try{
            Thread.sleep(100);
        }catch(InterruptedException exc){
            System.out.println("Hilo Principal INTERRUMPIDO");
        }
        System.out.println("Hilo Principal finalizado");
    }
}
