public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.edad = edad;
    }

    Persona(String l, String poo, int dia, int mes, int anio, int i2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fNacimiento = new Fecha(dia, mes, anio);
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + ", edad=" + edad + '}';
    }
}
