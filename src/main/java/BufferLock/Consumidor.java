/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferLock;

/**
 *
 * @author jesus
 */
public class Consumidor implements Runnable {

    private Buffer buffer;

    public void run() {
        while (true) {
            this.buffer.consumir();
        }
    }

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }
}
