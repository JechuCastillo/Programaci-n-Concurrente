/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.Ej1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class VerificarCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();

    private synchronized void hacerRetiro(int cant) throws InterruptedException {
        if (this.cb.getBalance() >= cant) {
            System.out.println(Thread.currentThread().getName() + " esta realizando un retiro de: " + cant + ".");
            Thread.sleep(1000);
            this.cb.retiroBancario(cant);
            System.out.println(Thread.currentThread().getName() + " RETIRO REALIZADO");
            System.out.println(Thread.currentThread().getName() + " RETIRO REALIZADO");
            System.out.println(Thread.currentThread().getName() + " : Los fondos son de: " + cb.getBalance());
        } else {
            System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de:" + cb.getBalance());
            Thread.sleep(1000);
        }
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                this.hacerRetiro(10);
                if(cb.getBalance()<0){
                    System.out.println("La cuenta esta sobreigrada");
                }
            }catch(InterruptedException ex){
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE,null,ex);
            }

        }
    }
}
