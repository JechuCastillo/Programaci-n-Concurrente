/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Administrativo extends Empleado {

    private char categoria;
    private int asistencia;

    //Constructores
    public Administrativo(char categoria, int asistencia, String legajo, Date ingreso, String funcion, double salario, String nombre, String dni, String dir, Date fecha, char s) {
        super(legajo, ingreso, funcion, salario, nombre, dni, dir, fecha, s);
        this.categoria = categoria;
        this.asistencia = asistencia;
    }

    public Administrativo() {
        this.categoria = '-';
        this.asistencia = 0;
    }
    
    //Observadores
    public char getCategoria() {
        return categoria;
    }

    public int getAsistencia() {
        return asistencia;
    }
    //Modificadores
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String toString(){
        return super.toString()+"\nCategoría:"+this.categoria+"Asistencia:"+this.asistencia;
    }
}
