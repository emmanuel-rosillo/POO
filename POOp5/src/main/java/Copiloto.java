public class Copiloto {
    private String nombre;
    private int edad;

    public Copiloto() {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Copiloto(String nombre, int edad) {
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
        return "Copiloto{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
