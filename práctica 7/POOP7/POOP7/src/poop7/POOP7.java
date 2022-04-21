/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

import poop7.actividad1.Empleado;
import poop7.actividad1.Gerente;

/**
 *
 * @author alumno
 */
public class POOP7 {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("Pedro");
        empleado.setNumEmpleado(997755);
        empleado.setSueldo(10_000);
        System.out.println(empleado);
        empleado.aumnetarSueldo(30);
        System.out.println(empleado);
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(228855);
        gerente.setSueldo(20_000);
        gerente.asignarPresupuesto(300_000);
        System.out.println(gerente);
        
        Gerente gerente2 = new Gerente(500_000, 119922, 30_000, "Jorch");
        System.out.println(gerente2);
        
        Empleado gerente3 = new Gerente(1_000_000, 11, 50_000, "Frida");
        System.out.println(gerente3);
        
        if (gerente instanceof Gerente){
            System.out.println("Instancia de gerente");
        }if(gerente instanceof Empleado){
            System.out.println("Intancia de empleado");
        }if (gerente instanceof Object){
            System.out.println("Instancia de object");
        }
        gerente.aumnetarSueldo(100);
        gerente.aumentarSueldo(50_000.5);
    }
    
}
