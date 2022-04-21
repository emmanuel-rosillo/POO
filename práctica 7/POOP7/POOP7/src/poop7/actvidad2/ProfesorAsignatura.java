/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.actvidad2;


/**
 *
 * @author alumno
 */
public class ProfesorAsignatura extends Profesor {
    private String trabajo;

    public ProfesorAsignatura() {
    }

    public ProfesorAsignatura(String trabajo, float salario, String escuela, int horario, String nombre, int edad, float peso) {
        super(salario, escuela, horario, nombre, edad, peso);
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    
    public void trabaja(){
        System.out.println("Trabajando");
    }

    @Override
    public String toString() {
        return "ProfesorAsignatura{" + "trabajo=" + trabajo + '}';
    }
    
}
