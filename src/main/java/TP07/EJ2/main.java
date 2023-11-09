/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP07.EJ2;

/**
 *
 * @author jesus
 */
public class main {

    public static void main(String[] args) {
        int cantEstudiantes = 23;
        int cantMesas = 5;
        SalaEstudio sala = new SalaEstudio(cantMesas);
        Estudiante estudiante[] = new Estudiante[cantEstudiantes];
        Thread hiloEstudiante[] = new Thread[cantEstudiantes];
        for (int i = 0; i < cantEstudiantes; i++) {
            estudiante[i] = new Estudiante(sala);
            hiloEstudiante[i] = new Thread(estudiante[i]);
            hiloEstudiante[i].start();
        }
        

    }
}
