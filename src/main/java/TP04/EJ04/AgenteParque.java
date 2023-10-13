/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ04;

/**
 *
 * @author jesus
 */
public class AgenteParque implements Runnable {

    private Actividad[] actividades;
    private int reserva;
    private String area;
    private String agenteName;

    public AgenteParque(String agenteName, Actividad[] areas, int reserva, String a) {
        this.actividades = areas;
        this.reserva = reserva;
        this.area = a;
        this.agenteName = agenteName;
    }

    public void run() {
        if (buscar(this.area).reservar(this.reserva)) {
            System.out.println(this.agenteName+" LOGRO RESERVAR EN "+this.area);
        }else{
            System.out.println(this.agenteName+" NO LOGRO HACER SU RESERVA EN "+this.area);
        }
    }

    //Suponemos que nos envian una actividad que existe
    private Actividad buscar(String a) {
        Actividad act = null;
        int i = 0;
        int longitud = this.actividades.length;
        while (i < longitud && act == null) {
            if (this.actividades[i].getNombre().equalsIgnoreCase(this.area)) {
                act = this.actividades[i];
            } else {
                i++;
            }
        }
        return act;
    }
}
