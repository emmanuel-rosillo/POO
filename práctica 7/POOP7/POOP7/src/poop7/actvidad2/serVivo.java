/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.actvidad2;

/**
 *
 * @author alumno
 */
public class serVivo {
    private String nombre;
    private int edad;
    private float peso;

    public serVivo() {
    }

    public serVivo(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void dormir(){
        System.out.println("Durmiendo");
    }
    
    public void comer(){
        System.out.println("Comiendo");
    }
    
    @Override
    public String toString() {
        return "serVivo{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
}
