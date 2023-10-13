/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP05.EJ01;

/**
 *
 * @author jesus
 */
public class SynchronizedObjectCounter {

    private int c = 0;

    public void increment() {
        synchronized ((Integer) this.c) {
            this.c++;
        }
    }

    public void decrement() {
        synchronized (this) {
            this.c--;
        }
    }

    public int value() {
        return this.c;
    }
}
