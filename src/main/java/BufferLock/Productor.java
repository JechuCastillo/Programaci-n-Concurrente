/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferLock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Productor implements Runnable {

    private Buffer buffer;

    public void run() {
        while(true){
                this.buffer.producir();
            
        }
    }

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }
}
