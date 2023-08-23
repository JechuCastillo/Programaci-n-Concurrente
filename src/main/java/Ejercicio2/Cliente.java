/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int dni;
    
    public Cliente(String unNombre, String unApe,int unDni){
        this.nombre=unNombre;
        this.apellido=unApe;
        this.dni=unDni;
    }
    public String toString(){
    return "Nombre:"+this.nombre+"\nApellido:"+this.apellido+"\nDni:"+this.dni;
    }
    public String getNombre(){
    return this.nombre;
    }
    public String getApellido(){
    return this.apellido;
    }
    public int getDni(){
        return this.dni;
    }
}
