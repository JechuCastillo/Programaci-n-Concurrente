/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class AvionComercial  extends AvionHelice{
    private int capacidad;
    public AvionComercial(String mat, int env, int anio,int pot,int cap){
    super(mat,env,anio,pot);
    this.capacidad=cap;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int calcularModulo(){
        return this.capacidad+ super.calcularModulo();
    }
    
}
