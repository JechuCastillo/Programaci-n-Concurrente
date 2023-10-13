/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP04.EJ04;

/**
 *
 * @author jesus
 */
public class Actividad {

    String nombre;
    boolean cupos[];

    public Actividad(String nombre,int n) {
        this.nombre=nombre;
        this.cupos = new boolean[n];
        this.inicializarCupos();
    }

    private void inicializarCupos() {
        int l = this.cupos.length;
        for (int i = 0; i < l; i++) {
            this.cupos[i] = true;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    //Suponemos que envian un entero dentro de rango del arreglo
    public synchronized boolean reservar(int i) {
        boolean exito=false;
        if(verificarLugarEnArea()){
            if(verificarLugar(i)){
                this.setCupo(i);
                exito=true;
            }
        }
        return exito;
    }

    public synchronized boolean verificarLugar(int i) {
        return this.cupos[i]; 
    }
    public synchronized void setCupo(int i){
        this.cupos[i]=!this.getCupo(i);
    }
    public synchronized boolean verificarLugarEnArea() {
        int i = 0;
        boolean encontrar = false;
        int c = this.cupos.length;
        while (i < c && !encontrar) {
            if(this.cupos[i]){
                encontrar=true;
            }
            i++;
        }
        return encontrar;
    }
    public synchronized boolean getCupo(int i){
        return this.cupos[i];
    }

}
