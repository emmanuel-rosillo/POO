package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alumno
 */
public class ProfesorDeCarrera extends Profesor {
    private int cantidadMaterias;

    public ProfesorDeCarrera(int cantidadMaterias, float salario, String escuela, int horario, String nombre, int edad, float peso) {
        super(salario, escuela, horario, nombre, edad, peso);
        this.cantidadMaterias = cantidadMaterias;
    }

    public ProfesorDeCarrera() {
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(int cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }
    
    public void darTitulos(){
        System.out.println("Dando Titulo");
    }

    @Override
    public String toString() {
        return "ProfesorDeCarrera{" + "cantidadMaterias=" + cantidadMaterias + '}';
    }
    
}
