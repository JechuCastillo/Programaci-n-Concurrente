/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP08.EJ1;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author jesus
 */
public class GestorSala {

    private int maxPermitido;
    private int personasEnSala;
    private ReentrantLock entrada;
    private Condition hayLugar;
    private Condition esJubilado;
    private Random n = new Random();
    private int personasQuePasaron;

    public GestorSala() {
        this.maxPermitido = 50;
        this.entrada = new ReentrantLock(true);
        this.hayLugar = entrada.newCondition();
        this.esJubilado = entrada.newCondition();
        this.personasEnSala = 0;
        this.personasQuePasaron = 0;
    }

    public void entrarSala() {
        try {
            this.entrada.lock();
            while (this.personasEnSala >= this.maxPermitido) {
                System.out.println("No hay lugar en la sala, por favor espera");
                this.hayLugar.await();
            }
            System.out.println("Una persona entra a la sala");
            this.personasEnSala++;
            this.personasQuePasaron++;
            System.out.println("Personas en sala: " + this.personasEnSala);
            System.out.println("Personas que pasaron: " + this.personasQuePasaron);
        } catch (InterruptedException e) {
        } finally {
            this.entrada.unlock();
        }
    }

    public void salirSala() {
        this.entrada.lock();
        System.out.println("Una persona sale del museo");
        this.personasEnSala--;
        System.out.println("Personas en sala: " + this.personasEnSala);
        this.hayLugar.signal();
        this.entrada.unlock();
    }

    public void entrarSalaJubilado() {
    }

    public void notificarTemperatura(int temperatura) {
        this.entrada.lock();
        System.out.println("La temperatura actual es de: " + temperatura);
        if (temperatura > 30) {
            this.maxPermitido = 35;
        } else if (temperatura < 30 && this.maxPermitido == 35) {
            this.maxPermitido = 50;
        }
        this.entrada.unlock();
    }

}
