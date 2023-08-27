/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Desarrollador extends Empleado {

    private String rol;
    private boolean titulo;
    private static HashMap<String, Integer> map;

    //Constructores
    public Desarrollador(String rol, boolean titulo, String legajo, Date ingreso, String funcion, double salario, String nombre, String dni, String dir, Date fecha, char s) {
        super(legajo, ingreso, funcion, salario, nombre, dni, dir, fecha, s);
        this.rol = rol;
        this.titulo = titulo;

    }

    public Desarrollador() {
        this.rol = "";
        this.titulo = false;
        map.put("Licenciado en Ciencias de la Computacion", 3000);
        map.put("Licenciado en Sistemas de la Informacion", 2000);
        map.put("Desarollador web", 1000);
    }

    //Observadores
    public String getRol() {
        return rol;
    }

    public boolean getTitulo() {
        return titulo;
    }

    //Modificadores
    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return super.toString() + "\nRol:" + this.rol + "\nTitulo:" + this.titulo;
    }
}
