/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class AvionHelice extends Avion {

    private int potenciaHP;

    public AvionHelice(String mat, int env, int anio,int pot) {
        super(mat, env, anio);
        this.potenciaHP=pot;
    }

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }
    public int calcularModulo(){
        return this.potenciaHP+ super.calcularModulo();
    }
    
}
