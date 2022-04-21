package poop7.actvidad2;/*
                        * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
                        * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
                        */

/**
 *
 * @author alumno
 */
public class Escuela extends Persona {
    private String escuela;

    public Escuela(String escuela, int horario, String nombre, int edad, float peso) {
        super(horario, nombre, edad, peso);
        this.escuela = escuela;
    }

    public Escuela() {
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Escuela{" + "escuela=" + escuela + '}';
    }

}
