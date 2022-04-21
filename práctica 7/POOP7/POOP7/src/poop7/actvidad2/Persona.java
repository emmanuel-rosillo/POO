package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alumno
 */
public class Persona extends serVivo {
    private int horario;

    public Persona(int horario, String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        this.horario = horario;
    }

    public Persona() {
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    
    public void hablar(){
        System.out.println("Hola");
    }

    @Override
    public String toString() {
        return "Persona{" + "horario=" + horario + '}';
    }
    
    
    
}
