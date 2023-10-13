/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioUno;

/**
 *
 * @author jesus
 */
public class Pasajero implements Runnable {

    private Tren tren;
    private Expendedora expendedora;

    public Pasajero(Tren t, Expendedora exp) {
        this.tren = t;
        this.expendedora = exp;
    }

    public void run() {
        this.expendedora.comprarTicket();
        this.tren.subir();
        this.tren.bajar();
    }
}
