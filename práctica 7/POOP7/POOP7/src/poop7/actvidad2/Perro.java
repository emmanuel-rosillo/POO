package poop7.actvidad2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */

public class Perro extends actvidad2.Mascota {
    private int largoOrejas;

    public Perro(int largoOrejas, String color, String raza, char tamaño, String nombre, int edad, float peso) {
        super(color, raza, tamaño, nombre, edad, peso);
        this.largoOrejas = largoOrejas;
    }

    public int getLargoOrejas() {
        return largoOrejas;
    }

    public void setLargoOrejas(int largoOrejas) {
        this.largoOrejas = largoOrejas;
    }

    public void ladrar() {
        System.out.println("woow");
    }

    @Override
    public String toString() {
        return "Perro{" + "largoOrejas=" + largoOrejas + '}';
    }

}
