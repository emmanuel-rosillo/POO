package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alumno
 */
public class Alumno extends Escuela {
    private String carrera;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String carrera, int semestre, float promedio, String escuela, int horario, String nombre, int edad, float peso) {
        super(escuela, horario, nombre, edad, peso);
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void hacerTarea(){
        System.out.println("Haciendo Tarea");
    }
    
    public void estudiar(){
        System.out.println("Estudiando");
    }

    @Override
    public String toString() {
        return "Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
}
