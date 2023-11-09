/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ6;

import TP07.EJ5.*;
import TP07.EJ4.*;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        Thread productor = new Thread(p);
        Thread consumidor = new Thread(c);
        productor.start();
        consumidor.start();
    }
}
