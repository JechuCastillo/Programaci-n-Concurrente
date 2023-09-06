/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

/**
 *
 * @author jesus
 */
public class RunnableCdor implements Runnable{
    private Dato contador;
    public RunnableCdor(Dato elCdor){
        this.contador=elCdor;
    }
    public void run(){
        for(int i = 0; i<10000;i++){
            this.contador.contar();
        }
    }
}
