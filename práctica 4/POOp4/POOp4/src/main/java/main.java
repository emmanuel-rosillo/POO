public class main {
    public static void main(String[] args) {
        System.out.println("###########Objeto Triangulo#########");
        Triangulo t1 = new Triangulo();
        t1.base = 12;
        t1.altura = 6;
        t1.perimetro();
        t1.area();

        System.out.println("###########Objeto Persona#########");

        Persona pepe = new Persona();
        pepe.nombre = "Pepe";
        pepe.apellido = "chuchin";
        pepe.altura = 1.76f;
        pepe.peso = 72.5f;

        pepe.boxear();
        pepe.comer();

        System.out.println("###########Objeto Perro#########");
        Perro pipoNormal = new Perro();
        pipoNormal.nombre = "pipo";
        pipoNormal.raza = "chihuahua";
        pipoNormal.color = "dorado";
        pipoNormal.altura = 68.2f;
        pipoNormal.peso = 24.3f;

        pipoNormal.ladrar();

        System.out.println("###########Objeto Alumno#########");
        Alumno lopez = new Alumno();
        lopez.nombre = "lopez";
        String nombreLopez = lopez.nombre;
        System.out.println(nombreLopez);

        System.out.println("###########Objeto Profesor#########");
        Profesor jirafales = new Profesor();
        jirafales.nombre = "jirafales";
        jirafales.grupo = "a1";
        jirafales.noDeAlumnos = 12;
        Profesor.calificacionFinal(nombreLopez);

    }
}
