import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Hashtable<String, String> mitabla = new Hashtable<String, String>();

        mitabla.put("color1", "verde");
        mitabla.put("color2", "amarillo");
        mitabla.put("color3", "Azul");
        mitabla.put("color4", "rojo");
        mitabla.put("color5", "naranja");

        System.out.println("############obtener el identificador############");
        for (String i : mitabla.keySet()) {
            System.out.println(i);
        }
        System.out.println("##########Todos los raws###########");
        String key;
        String value;
        Enumeration<String> enumlla = mitabla.keys();
        while (enumlla.hasMoreElements()) {
            key = enumlla.nextElement();
            value = mitabla.get(key);
            System.out.println(key + " " + value);
        }

        System.out.println("###########Mi color Favorito############");
        System.out.println(mitabla.get("color3"));
        System.out.println("Su clave: " + mitabla.get("Azul"));

        System.out.println("#############ToDate##############");
        Date hoy = new Date();
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(fd.format(hoy));

        System.out.println("#############CalendarInstance##############");
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println("###########Personas y sus cumples############");
        List<String> getData = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            int o = i +1;
            int p = i +2;
            int y = i  - 25;
            String fechaActual = c.get(Calendar.DAY_OF_MONTH)+p + " de ";
            fechaActual += c.get(Calendar.MONTH)+o + " de ";
            fechaActual += c.get(Calendar.YEAR)+y;
            getData.add(fechaActual);
        }

        Hashtable<String, String> persons = new Hashtable<String, String>();
        String a = getData.get(0);
        String b = getData.get(1);
        String m = getData.get(2);
        String d = getData.get(3);
        String e = getData.get(4);
        persons.put("Juan", a);
        persons.put("Pedro", b);
        persons.put("José", m);
        persons.put("María", d);
        persons.put("Sofía", e);
        System.out.println("############Las personas############");
        for (String i : persons.keySet()) {
            System.out.println(i);
        }
        System.out.println("##########Todos los raws###########");
        String llave;
        String valor;
        Enumeration<String> print = persons.keys();
        while (print.hasMoreElements()) {
            llave = print.nextElement();
            valor = persons.get(llave);
            System.out.println(llave + " " + valor);
        }
        System.out.println("##########Juanito le dijeron que se quedó solo por feo###########");
        System.out.println("juan nació en:" + persons.get("Juan"));
    }
}
