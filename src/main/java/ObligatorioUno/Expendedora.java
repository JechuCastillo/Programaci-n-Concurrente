/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObligatorioUno;

/**
 *
 * @author jesus
 */
public class Expendedora {

    private int cantidadVendidos;

    public Expendedora() {
        this.cantidadVendidos = 0;
    }

    public synchronized void comprarTicket(){
        this.cantidadVendidos++;
        System.out.println("Ticket comprados: "+this.cantidadVendidos);
    }
}
