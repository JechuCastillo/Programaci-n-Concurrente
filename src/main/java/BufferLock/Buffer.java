/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Buffer {

    private ReentrantLock lock;
    private Condition hayElementos;
    private int contador;
    private int elementosEnBuffer;

    public Buffer() {
        this.elementosEnBuffer = 0;
        this.lock = new ReentrantLock(true);
        this.hayElementos = lock.newCondition();
    }

    public void producir() {
        this.lock.lock();
        this.elementosEnBuffer++;
        System.out.println("Se pone un elemento en el buffer: " + this.elementosEnBuffer);
        hayElementos.signalAll();
        this.lock.unlock();
    }

    public void consumir() {
        this.lock.lock();
        try {
            while (this.elementosEnBuffer <= 0) {
                this.hayElementos.await();
            }
            this.elementosEnBuffer--;
            System.out.println("Se quito un elemento del buffer " + this.elementosEnBuffer);
        } catch (InterruptedException ex) {
            Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.lock.unlock();
        }
    }


}
