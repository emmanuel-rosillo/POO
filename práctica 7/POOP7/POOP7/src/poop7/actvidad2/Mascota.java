/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7.actvidad2;

/**
 *
 * @author alumno
 */
public class Mascota extends serVivo {
    private String color, raza;
    private char tamaño;

    public Mascota() {
    }

    public Mascota(String color, String raza, char tamaño, String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        this.color = color;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getTamaño() {
        return tamaño;
    }

    public void setTamaño(char tamaño) {
        this.tamaño = tamaño;
    }

    public void jugar() {
        System.out.println("Jugar");
    }

    public void correr() {
        System.out.println("Corriendo");
    }

    @Override
    public String toString() {
        return "Mascota{" + "color=" + color + ", raza=" + raza + ", tama\u00f1o=" + tamaño + '}';
    }

}
