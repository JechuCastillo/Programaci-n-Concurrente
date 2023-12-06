/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferLock;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        Thread hiloP = new Thread(p);
        Thread hiloC = new Thread(c);
        hiloP.start();
        hiloC.start();
    }
}
