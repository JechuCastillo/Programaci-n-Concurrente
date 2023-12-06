/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiParcial;

import java.util.Random;

/**
 *
 * @author jesus
 */
public class Socio implements Runnable {

    private Serie serie;
    private int cantVistos;
    private int numero;

    public Socio(Serie s, int num) {
        this.serie = s;
        this.cantVistos = 0;
        this.numero = num;
    }

    public void run() {
        Random n = new Random();
        if (n.nextInt(2) == 0) {
            while (true) {
                this.serie.mirarIngles(this.cantVistos, numero);
                this.cantVistos++;
                System.out.println("Socio " + this.numero + " vio: " + this.cantVistos+" En ingles");
            }
        } else {
            while (true) {
                this.serie.mirarEspaniol(this.cantVistos, numero);
                this.cantVistos++;
                System.out.println("Socio " + this.numero + " vio: " + this.cantVistos+" en Español");

            }
        }
    }
}
