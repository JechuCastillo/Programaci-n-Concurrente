/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ01;

/**
 *
 * @author jesus
 */
public class SynchronizedCounter {
    private int c = 0;
    public synchronized void increment(){
        this.c++;
    }
    public void decrement(){
        this.c--;
    }
    public synchronized int value(){
        return this.c;
    }
    
}
