package javaapplication1;

public class Alumno {
//  atributes

    String nombre;
    String apPat;
    String apMat;
    Integer numCuenta;
    Integer edad;

//  constructors
    public Alumno() {
    }
    public Alumno(String nombre, String apPat, String apMat, Integer numCuenta, Integer edad) {
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }

//  methods
//    -setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
//   -getters
    public String getNombre() {
        return nombre;
    }
    public String getApPat() {
        return apPat;
    }
    public String getApMat() {
        return apMat;
    }
    public Integer getNumCuenta() {
        return numCuenta;
    }
    public Integer getEdad() {
        return edad;
    }

}
