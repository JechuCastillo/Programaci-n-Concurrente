/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HamsterMonitor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Rueda {

    public synchronized void rodar(String name) {
        System.out.println(name+" usa la rueda para hacer ejercicio");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Rueda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
