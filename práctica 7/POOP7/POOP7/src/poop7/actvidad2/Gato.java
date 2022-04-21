package poop7.actvidad2;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Gato extends actvidad2.Mascota {
    private int numeroDeVidas;
    
    public Gato(int numeroDeVidas, String color, String raza, char tamaño, String nombre, int edad, float peso) {
        super(color, raza, tamaño, nombre, edad, peso);
        this.numeroDeVidas = numeroDeVidas;
    }

    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    
    public void bañarse(){
        System.out.println("Bañandose");
    }
    
    public void maullar(){
        System.out.println("Maullando");
    }
    
    public void abandonar(){
        System.out.println("abandonando");
    }

    @Override
    public String toString() {
        return "Gato{" + "numeroDeVidas=" + numeroDeVidas + '}';
    }
    
    
    
}
