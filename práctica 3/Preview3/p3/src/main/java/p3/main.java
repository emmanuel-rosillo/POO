package p3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String[] args) {

        String nombre = new String("Emmanuel");
        String apellidos = new String("Rosillo");

        System.out.println(nombre + " " + apellidos);

        System.out.println("#########colecciones###########");
        ArrayList<Integer> miListaArreglo = new ArrayList<Integer>();
        Integer d = 65;
        miListaArreglo.add(d);
        Integer a = miListaArreglo.size();
        Integer element = miListaArreglo.get(0);
        //Integer element = miListaArreglo.get(0);

        for (Integer integer : miListaArreglo) {
            System.out.println("mi Arreglo: " + integer);
        }
        System.out.println("###########HasHTable###########");

        Hashtable<String, Integer> mitabla = new Hashtable<String, Integer>();

        mitabla.put("uno", 1);
        mitabla.put("dos", 2);
        mitabla.put("tres", 3);

        for (String string : mitabla.keySet()) {
            System.out.println(string);
        }
        System.out.println("##########enumeracion###########");
        String key;
        Integer value;
        Enumeration<String> enumlla = mitabla.keys();
        while (enumlla.hasMoreElements()) {
            key = enumlla.nextElement();
            value = mitabla.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("#########Math#########");

        System.out.println("Pi= " + 3.1416);
        System.out.println("Pi= " + Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 5));
        System.out.println(Math.max(100000, 10000000));
        System.out.println(Math.sqrt(25));

        System.out.println("#############date##############");
        Date hoy = new Date();
        System.out.println("fecha de hoy: " + hoy);

        System.out.println("###########Calendario###########");
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println("###########FORMAT DATE############");
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(fd.format(hoy));

        System.out.println("###########FORMAT CALENDAR############");
        String fechaActual = c.get(Calendar.DAY_OF_MONTH) + " de ";
                fechaActual += c.get(Calendar.MONTH)+1 + " de ";
                fechaActual += c.get(Calendar.YEAR);

        System.out.println(fechaActual);


    }





}
