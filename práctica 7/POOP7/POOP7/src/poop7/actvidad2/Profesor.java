package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Profesor extends Escuela {
    private float salario;

    public Profesor() {
    }

    public Profesor(float salario, String escuela, int horario, String nombre, int edad, float peso) {
        super(escuela, horario, nombre, edad, peso);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void dejarTarea(){
        System.out.println("Tarea");
    }
    
    public void darClase(){
        System.out.println("dando clases");
    }
    
    public void cobrar(){
        System.out.println("cobrar");
    }

    @Override
    public String toString() {
        return "Profesor{" + "salario=" + salario + '}';
    }
    
    
}
