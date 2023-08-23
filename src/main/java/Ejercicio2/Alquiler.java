/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Alquiler {

    private Cliente cliente;
    private Date fechaInicio;
    private int horaInicio;
    private int horaFin;
    private int posicion;
    private Avion avion;
    private static final double valorFijo=250;
    //Constructores
    public Alquiler(Cliente unCliente, Date fechaIni, int hsIni, int hsFin, int pos, Avion unAvion) {
        this.cliente = unCliente;
        this.avion = unAvion;
        this.fechaInicio = fechaIni;
        this.horaFin = hsFin;
        this.horaInicio = hsIni;
        this.posicion = pos;
    }
    public Alquiler() {
        this.cliente = null;
        this.avion = null;
        this.fechaInicio = null;
        this.horaFin = 0;
        this.horaInicio = 0;
        this.posicion = -1;
    }
    //OBSERBADORES
    public Avion getAvion() {
        return avion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public int getPosicion() {
        return posicion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    //MODIFICADORES
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public double calcularValor(){
        return this.valorFijo+((this.horaFin-this.horaInicio)*avion.calcularModulo());
    }
    
    
    
}
