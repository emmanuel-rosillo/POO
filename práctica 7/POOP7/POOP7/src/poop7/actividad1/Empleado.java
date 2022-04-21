/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.actividad1;

/**
 *
 * @author alumno
 */

public class Empleado {//extends Object
    private int numEmpleado, sueldo;
    private String nombre;
    
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        if(sueldo >= 0)
            this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado() {
    }
    /**
     * 
     * @param numEmpleado el numero del empleado
     * @param sueldo el sueldo del empleado
     * @param nombre el nombre del empleado
     * 
     * constructor lleno
     */
    public Empleado(int numEmpleado, int sueldo, String nombre) {
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    /**
     * 
     * @param porcentaje procentaje de aumento
     * 
     * aumenta el suledo en un porcentaje
     */
    public void aumnetarSueldo(int porcentaje){
        sueldo += (int) (sueldo * porcentaje / 100);
    }
    /**
     * Imprime el empleado
     * 
     * @return regresa la informacion del empleado 
     */
    @Override
    public String toString() {
        return "Empleado{" + "numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + ", nombre=" + nombre + '}';
    }
    
    
}
