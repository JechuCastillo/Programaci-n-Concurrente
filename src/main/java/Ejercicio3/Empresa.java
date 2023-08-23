/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Empresa {

    private Empleado colEmpleados[];
    private ArrayList empleados;

    public Empresa() {
        this.empleados = new ArrayList();
    }

    public Empresa(ArrayList colEmpleados) {
        this.empleados = colEmpleados;
    }

    public ArrayList empleadosAntiguedadMayorA(int num) {
        int longitud = this.empleados.size();
        ArrayList colAntiguos = new ArrayList();
        boolean antiguedad;
        for (int i = 0; i < longitud; i++) {
            Empleado emp = (Empleado)this.empleados.get(i);
            if (emp.antiguedadMayorA(num)) {
                colAntiguos.add(this.empleados.get(i));
            }
        }
        return colAntiguos;
    }
}
