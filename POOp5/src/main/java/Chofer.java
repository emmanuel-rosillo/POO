public class Chofer {
    private String nombre;
    private int edad;

    public Chofer(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Chofer() {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
