public class main {
        public static void main(String[] args) {
                Circulo c1 = new Circulo();
                c1.setRadio(5);
                double r1 = c1.getRadio();
                System.out.println("radio: " + r1);

                Circulo c2 = new Circulo();
                c2.setRadio(-15);
                System.out.println("c2: " + c2);

                System.out.println("###########composicion##########");
                Persona p1 = new Persona();
                p1.setNombre("lucio");
                p1.setApellido("ramos");
                Fecha f1 = new Fecha(2, 3, 1998);
                p1.setfNacimiento(f1);
                System.out.println("preson: " + p1);
                System.out.println(f1);
                System.out.println("##############");
                Fecha f2 = new Fecha(2, 3, 1997);
                Persona p2 = new Persona("Luci", "POO", f2, 25);
                System.out.println("##############");
                Persona p3 = new Persona("lu", "POO", new Fecha(3, 3, 2000), 22);
                System.out.println("##############");
                Persona p4 = new Persona("l", "POO", 4, 8, 2000, 60);
                System.out.println(p4);

                System.out.println("##############Clase coche##############");
                Chofer chofer1 = new Chofer();
                chofer1.setNombre("LolaLaTrailera");
                chofer1.setEdad(21);
                chofer1.getNombre();
                chofer1.getEdad();

                Copiloto pilot1 = new Copiloto();
                pilot1.setNombre("farruko");
                pilot1.setEdad(3);

                Pasajero pasajero1 = new Pasajero();
                pasajero1.setNombre("Marco");
                pasajero1.setEdad(4);

                Pasajero pasajero2 = new Pasajero();
                pasajero2.setNombre("luis");
                pasajero2.setEdad(8);

                Coche car1 = new Coche();
                car1.personas = new Coche[4];
                Chofer ch1 = new Chofer("Lola", 4);
                car1.personas[0] = ch1;         

        }
}