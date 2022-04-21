package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alumno
 */
public class Mesero extends Persona {
    int salario;

    public Mesero() {
    }

    public Mesero(int salario, int horario, String nombre, int edad, float peso) {
        super(horario, nombre, edad, peso);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void cargar(){
        System.out.println("Cargando");
    }
    
    public void correr(){
        System.out.println("corriendo");
    }
    
    public void cobrar(){
        System.out.println("cobrando");
    }

    @Override
    public String toString() {
        return "Mesero{" + "salario=" + salario + '}';
    }
    
}
