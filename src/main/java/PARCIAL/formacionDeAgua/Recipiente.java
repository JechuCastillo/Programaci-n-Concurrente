/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARCIAL.formacionDeAgua;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class Recipiente {

    private int vecesParaLlenarse;
    private int cantidadOxigeno;
    private int cantidadHidrogeno;
    private int contador;
    private ReentrantLock llegada = new ReentrantLock();
    private Condition oxigenoSuficiente;
    private Condition hidrogenoSuficiente;
    private Condition atomosListos;

    public Recipiente(int k) {
        this.vecesParaLlenarse = k;
        this.cantidadHidrogeno = 0;
        this.cantidadHidrogeno = 0;
        this.oxigenoSuficiente = llegada.newCondition();
        this.hidrogenoSuficiente = llegada.newCondition();
        this.atomosListos = llegada.newCondition();
        this.contador = 0;
    }

    public void Olisto() {
        this.llegada.lock();
        try {
            while (this.cantidadOxigeno > 0) {
                this.oxigenoSuficiente.await();
            }
            this.cantidadOxigeno++;
            System.out.println("Entra oxigeno:" + this.cantidadOxigeno);
            this.atomosListos.signalAll();
        } catch (InterruptedException ex) {
            Logger.getLogger(Recipiente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.llegada.unlock();
        }
    }

    public void Hlisto() {
        this.llegada.lock();
        try {
            while (this.cantidadHidrogeno >= 2) {
                this.hidrogenoSuficiente.await();
            }
            this.cantidadHidrogeno++;
            System.out.println("Entra hidrogeno:" + this.cantidadHidrogeno);
            this.atomosListos.signal();
        } catch (InterruptedException ex) {
            Logger.getLogger(Recipiente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.llegada.unlock();
        }
    }

    public void hacerAgua() {
        this.llegada.lock();
        try {
            while (this.cantidadHidrogeno < 2 || this.cantidadOxigeno < 1) {
                this.atomosListos.await();
            }
            this.contador++;
            System.out.println("Se hace agua: " + "Cantidad de agua: " + this.contador + "ML");
            if (this.contador == this.vecesParaLlenarse) {
                this.contador=0;
                System.out.println("Recipiente vaciado y agua distribuida:\n Agua en recipiente:" + this.contador);
            }
            this.cantidadOxigeno=0;
            this.cantidadHidrogeno=0;
            this.oxigenoSuficiente.signal();
            this.hidrogenoSuficiente.signalAll();
        } catch (InterruptedException ex) {
            Logger.getLogger(Recipiente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.llegada.unlock();
        }
    }


}
