/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.*;
/**
 *
 * @author jesus
 */
public class Test {
    public static void main(String[] args) {
        Alquiler []alquiler= new Alquiler[2];
        Cliente unCliente = new Cliente("Nati", "Gutierrez", 40442543);
        Date fechaIni= new Date(12, 8, 2023);
        AvionReaccion unAvion = new AvionReaccion("ABC123", 10, 2009, 4);
        alquiler[0]=new Alquiler(unCliente, fechaIni, 2, 7, 0, unAvion);
        Aeropuerto a = new Aeropuerto(alquiler);
        System.out.println("Valor:"+a.calcularValorAlquiler(0));
    }
}
