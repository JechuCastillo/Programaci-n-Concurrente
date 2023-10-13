/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioUno;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        Tren t = new Tren(3);
        Expendedora e = new Expendedora();
        Pasajero p[] = new Pasajero[6];
        ControlTren c = new ControlTren(t);
        for (int i = 0; i < p.length; i++) {
            p[i] = new Pasajero(t,e);
        }
        Thread h[] = new Thread[6];
        for (int j = 0; j < h.length; j++) {
            h[j] = new Thread(p[j]);
        }
        for (int j = 0; j < h.length; j++) {
            h[j].start();
        }
        

    }
}
