/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP03.EJ07;

/**
 *
 * @author jesus
 */
public class Cajero {

    private String nombre;

    public Cajero(String n) {
        this.nombre = n;
    }

    public void esperarXsegundos(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
            System.out.println("EJECUCION INTERRUMPIDA");
        }
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("El cajero " + this.nombre + "COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getName() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 100 + " seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado del producto " + (i + 1) + "->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " ");
        }
        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getName() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
    }

}
