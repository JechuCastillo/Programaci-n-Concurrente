/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class AvionReaccion extends Avion{
    private int nroMotor;
    public AvionReaccion(String mat, int env, int anio,int nro){
        super(mat,env,anio);
        this.nroMotor=nro;
    }

    public int getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(int nroMotor) {
        this.nroMotor = nroMotor;
    }
    public int calcularModulo(){
        return this.nroMotor+ super.calcularModulo();
    }
    
}
