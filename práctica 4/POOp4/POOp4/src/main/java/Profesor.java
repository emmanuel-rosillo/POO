public class Profesor {

    String nombre, materia, grupo, salon;
    int noDeAlumnos;

    public Profesor() {
        this.nombre = nombre;
        this.materia = materia;
        this.grupo = grupo;
        this.noDeAlumnos = noDeAlumnos;
    }

    public void enseñar(String nombreLopez) {
        System.out.println("el profesor: " + nombre + " está de enseñando al grupo " + grupo
                + " \ncual tiene un numero de alumnos: " + noDeAlumnos);
        System.out.println("En este grupo se encuentra " + nombreLopez + "Está inscrito para tomar el curso");
    }

    public static void calificacionFinal(String nombreLopez) {
        int a, b, c;
        a = 10;
        b = 10;
        c = 10;
        System.out.println("Al calificar a " + nombreLopez + " se obtuvieron los sig. resultados: ");
        System.out.println("parcial 1: " + a + "\nparcial 2: " + b + "\nparcial 3: " + c);
        float cal = Profesor.promediar(a, b, c);
        System.out.println("Por lo que obtuvo un promedi de: " + cal);
        Alumno.promedio(cal);
    }

    public static float promediar(int a, int b, int c) {
        float calculo = (a + b + c) / 3;
        return (calculo);
    }

}
