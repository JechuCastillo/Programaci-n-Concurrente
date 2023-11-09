/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ3;

/**
 *
 * @author jesus
 */
public class Main {

    public static void main(String[] args) {
        int cantEstudiantes = 10;
        int cantMesas = 3;
        Estudiante estudiante[] = new Estudiante[cantEstudiantes];
        SalaEstudio sala = new SalaEstudio(cantMesas);
        Thread hiloEstudiante[] = new Thread[cantEstudiantes];
        for (int i = 0; i < cantEstudiantes; i++) {
            estudiante[i] = new Estudiante(sala);
            hiloEstudiante [i]= new Thread(estudiante[i]);
            hiloEstudiante[i].start();
        }
    }
}
