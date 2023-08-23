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
public abstract class Persona {

    private String nombre;
    private String dni;
    private String direccion;
    private Date nacimiento;
    private char sexo;

    //Constructores
    public Persona(String nombre, String dni, String dir, Date fecha, char s) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = dir;
        this.nacimiento = fecha;
        this.sexo = s;
    }

    public Persona() {
        this.nombre = "";
        this.dni = "";
        this.direccion = "";
        this.nacimiento = new Date(0,0,0);
        this.sexo = ' ';
    }
    //Observadores
    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }
    //Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString(){
        return "Nacimiento:"+this.nacimiento.toString()+"\nNombre:"+this.nombre+"\nDni:"+this.dni+"\nDireccion:"+this.direccion+
                "\nSexo: "+this.sexo;
    }
}
