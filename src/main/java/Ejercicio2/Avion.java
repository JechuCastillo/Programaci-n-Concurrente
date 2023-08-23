/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Admin
 */
public abstract class Avion {

    private String matricula;
    private int envergadura;
    private int anioFabricacion;

    public Avion(String mat, int env, int anio) {
        this.matricula = mat;
        this.envergadura = env;
        this.anioFabricacion = anio;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getEnvergadura() {
        return envergadura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setEnvergadura(int envergadura) {
        this.envergadura = envergadura;
    }
    
    public int calcularModulo(){
        return this.envergadura*20;
    }

}
