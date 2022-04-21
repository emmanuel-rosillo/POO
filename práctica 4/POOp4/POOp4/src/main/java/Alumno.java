public class Alumno {
    static String nombre;
    String apellido;
    String escuela;
    static float calificaciones;
    int edad;
    float calificacionesPOO;

    public Alumno() {
        this.apellido = apellido;
        this.nombre = nombre;
        this.escuela = escuela;
        this.calificaciones = calificaciones;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellido, String escuela, int calificaciones, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.escuela = escuela;
        this.calificaciones = calificaciones;
        this.edad = edad;
    }

    public void comer() {
        System.out.println("en la escuela " + escuela + "tienen permitido el horario de comida de 8 a 2");
    }

    public void correr() {
        System.out.println("el alumno " + nombre + " " + " tiene " + edad + " por lo que puede correr hasta 18 km/h");
    }

    public static float promedio(float cal) {
        int b = 9;
        int c = 8;
        System.out.println("despues de una larga jornada de estudio el alumno: " + nombre + " promedio\n");
        System.out.println("POO " + cal);
        System.out.println("edai 2 " + b);
        System.out.println("cyg " + c);
        float calificacionesPOO = (cal + b + c) / 3;
        Alumno.calificaciones = calificacionesPOO;
        return (calificacionesPOO);
    }

    public void printcalf(float calificacionesPOO) {
        Alumno.promedio(calificacionesPOO);
        System.out.println("alumno: " + nombre);
        System.out.println("promedio: " + calificacionesPOO);
    }

    public void estudiar() {
        System.out.println("El alumno " + nombre + " " + apellido
                + " esta estudiando porque tiene examen y necesita sacar un buen promedio");
        printcalf(calificacionesPOO);
    }
}
