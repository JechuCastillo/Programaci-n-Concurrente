/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP09.OBSERVATORIO;

/**
 *
 * @author jesus
 */
public class pruebaMain {

    public static void main(String[] args) {
        int capacidad = 50;
        int cantVisitantes = 120;
        int cantInvestigadores = 4;
        int cantPersonal = 20;
        Observatorio obs = new Observatorio(capacidad);
        Investigador investigador[] = new Investigador[cantInvestigadores];
        PersonalMantenimiento personal[] = new PersonalMantenimiento[cantPersonal];
        Visitante visitante[] = new Visitante[cantVisitantes];
        Thread hiloVisitante[] = new Thread[cantVisitantes];
        Thread hiloInvestigador[] = new Thread[cantInvestigadores];
        Thread hiloPersonal[] = new Thread[cantPersonal];

        for (int i = 0; i < cantVisitantes; i++) {
            visitante[i] = new Visitante(obs);
            hiloVisitante[i] = new Thread(visitante[i]);
            hiloVisitante[i].start();
        }
        for (int i = 0; i < cantInvestigadores; i++) {
            investigador[i] = new Investigador(obs);
            hiloInvestigador[i] = new Thread(investigador[i]);
            hiloInvestigador[i].start();
        }
        for (int i = 0; i < cantPersonal; i++) {
            personal[i] = new PersonalMantenimiento(obs);
            hiloPersonal[i] = new Thread(personal[i]);
            hiloPersonal[i].start();
        }
    }
}
