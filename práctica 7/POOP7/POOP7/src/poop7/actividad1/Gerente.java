/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.actividad1;

/**
 *
 * @author alumno
 */
public class Gerente extends Empleado {
    private int presupuesto;

    /**
     * 
     * @param presupuesto el presupuesto del gerente
     * @param numEmpleado el numero del gerente
     * @param sueldo      el sueldo del gerente
     * @param nombre      el nombre del gerente
     * 
     *                    constructor lleno
     */
    public Gerente(int presupuesto, int numEmpleado, int sueldo, String nombre) {
        super(numEmpleado, sueldo, nombre);
        this.presupuesto = presupuesto;
    }

    /**
     * 
     * @param presupuesto presupuesto que se asignarà
     * 
     *                    Asigna un presupuesto al gerente
     */
    public void asignarPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Gerente() {
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * 
     * @param sueldo el sueldo que se le asignara
     * 
     *               Se cambia el sueldo del gerente
     */
    public void aumentarSueldo(double sueldo) {
        super.setSueldo((int) sueldo);
    }

    /**
     * 
     * @return la informaciòn del gerente
     *         imprime la informacion del teclado
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }

}
