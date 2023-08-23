/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP02.EJ1;

import static TP02.EJ1.Ruleta.jugar;
import java.util.*;

/**
 *
 * @author jesus
 */
public class PruebaExcep {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        int edad;
//
//        try {
//            System.out.println("Ingrese la edad");
//            edad = sc.nextInt();
//            menorDeEdad(edad);
//        } catch (menorEdad e) {
//            System.err.println("Excepcion: " + e.getMessage());
//        }
//        try {
//            System.out.println("Ingrese un numero");
//            int num = sc.nextInt();
//            jugar(num);
//            System.out.println("GANASTE!");
//        } catch (Ruleta e) {
//            System.err.println("Excepcion: " + e.getMessage());
//        }
        mostrarArray();
    }

    public static void mostrarArray() {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int[] arr = new int[5];
        while (contador <= 5) {
            System.out.println("Ingrese un numero");
            arr[contador-1]=sc.nextInt();
            contador++;
        }
        try{
            for(int i = 0; i<7;i++){
                System.out.print(arr[i]+", ");
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    
    

}
