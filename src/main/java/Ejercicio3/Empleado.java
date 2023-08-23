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
public class Empleado extends Persona {

    private String funcion;
    private double salario;
    private Date ingreso;
    private String legajo;
    //Constructores

    public Empleado(String legajo, Date ingreso, String funcion, double salario, String nombre, String dni, String dir, Date fecha, char s) {
        super(nombre, dni, dir, fecha, s);
        this.funcion = funcion;
        this.salario = salario;
        this.legajo = legajo;
        this.ingreso = ingreso;
    }

    public Empleado() {
        this.funcion = "";
        this.salario = 0;
        this.legajo = "";
        this.ingreso = new Date();
    }

    //Observadores
    public String getFuncion() {
        return funcion;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public String getLegajo() {
        return legajo;
    }

    public double getSalario() {
        return salario;
    }

    //Modificadores
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public boolean antiguedadMayorA(int n) {
        int anio1, anio2;
        Date hoy = new Date();
        //Obtengo el anio de cada fecha
        int anioActual = this.ingreso.getYear();
        int anioIngreso = this.ingreso.getYear();
        //Retorna si es mayor a la cantidad de anios pasada por parametro
        return ((anioActual - anioIngreso) > n);
    }

    public String toString() {
        return super.toString() + "Funcion:" + this.funcion + "Salario:$" + this.salario + "\nLegajo" + this.legajo + "\nIngreso" + this.ingreso.toString();
    }
    

}
