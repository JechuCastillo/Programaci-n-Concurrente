/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ07;

/**
 *
 * @author jesus
 */
public class Mozo implements Runnable {
    private Mesa mesa;
    public Mozo(Mesa m){
        this.mesa=m;
    }
    public void run() {
        while(true){
        this.mesa.atender();
        }
    }
}
