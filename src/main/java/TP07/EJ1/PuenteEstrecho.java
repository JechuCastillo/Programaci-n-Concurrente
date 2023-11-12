/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesus
 */
public class PuenteEstrecho {

    private Semaphore pasoNorte;
    private Semaphore pasoSur;
    private Semaphore paso;
    private int cantSur;
    private int cantNorte;
    private int contador;

    public PuenteEstrecho(int cantSur, int cantNorte) {
        this.pasoNorte = new Semaphore(0);
        this.pasoSur = new Semaphore(10);
        this.paso = new Semaphore(1);
        this.cantSur = cantSur;
        this.cantNorte = cantNorte;
        this.contador = 0;
    }

    public void pasarSur() {
        try {
            this.pasoSur.acquire();
            this.paso.acquire();
            System.out.println("Un auto del sur cruza el puente");
            this.cantSur--;
            this.contador++;
        } catch (InterruptedException ex) {
            Logger.getLogger(PuenteEstrecho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void terminarDePasarSur() {
        System.out.println("Un auto del sur ha cruzado");

        if (this.contador == 10) {
            this.pasoNorte.release(10);
            this.contador = 0;

        } else if (this.cantSur == 0) {
            this.pasoNorte.release(cantNorte);
        }
        this.paso.release();
    }

    public void pasarNorte() {
        try {
            this.pasoNorte.acquire();
            this.paso.acquire();
            System.out.println("Un auto del norte cruza el puente");
            this.cantNorte--;
            this.contador++;
        } catch (InterruptedException ex) {
            Logger.getLogger(PuenteEstrecho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void terminarDePasarNorte() {
        System.out.println("Un auto del norte ha cruzado");

        if (this.contador == 10) {
            this.pasoSur.release(10);
            this.contador = 0;

        } else if (this.cantNorte == 0) {
            this.pasoSur.release(this.cantSur);

        }
        this.paso.release();

    }
}
