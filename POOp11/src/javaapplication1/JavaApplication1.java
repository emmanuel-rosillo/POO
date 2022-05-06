/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println();
//        File f1 = new File ("archivo.txt");
//        System.out.println(f1.exists());
//        if(!f1.exists()){
//            try{
//                boolean n = f1.createNewFile();
//            }catch(IOException a){
//                System.out.println(a.getMessage());
//            }
//        }
//        FileOutputStream fos = null;
//        byte[] buffer = new byte[81];
//        int n;
//        System.out.println("escriba texto");
//        try{
//            n = System.in.read(buffer);
//            fos = new FileOutputStream("fos.txt");
//            fos.write(buffer, 0, n);
//        } catch (IOException ex) {
//            Logger.getLogger(ex.getMessage());
//        }finally{
//            if(fos != null){
//                try{
//                    fos.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(ex.getMessage());
//                }
//            }
//        }
//        FileInputStream fis = null;
//        try{
//            fis= new FileInputStream("fos.txt");
//            n = fis.readNBytes(buffer, 0, buffer.length);
//            String t = new String(buffer, 0, n);
//            System.out.println(t);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        }catch (IOException ex) {
//                    Logger.getLogger(ex.getMessage());
//        }finally{
//            if(fis!=null){
//                try{
//                    fis.close();
//                } catch (IOException ex) {
//                    Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        System.out.println("···buffer···");
//        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("esciba");
//        try{
//            String t1 = b1.readLine();
//            FileWriter fw = new FileWriter("fw.csv");
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter salida = new PrintWriter(bw);
//            salida.println(t1);
//            for (int i = 0; i < 10; i++) {
//                salida.println("line" + i);
//            }
//            for (int i = 0; i < 10; i++) {
//                salida.println("elemma, uvas, 31255566" + i);
//
//            }
//            salida.close();
//        } catch (IOException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        }finally{
//
//        }
//        System.out.println("···reader···");
//        try{
//
//            FileReader fr = new FileReader("fw.csv");
//            b1 = new BufferedReader(fr);
//            System.out.println("texto: ");
//            String l = b1.readLine();
//            while(l != null){
//                System.out.println(l);
//                l = b1.readLine();
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("#####StringTokenizer####");
//        String c1 = "elemma, uvas, 312555660";
//        StringTokenizer tiktok = new StringTokenizer(c1, ",");
//        while(tiktok.hasMoreTokens()){
//            System.out.println(tiktok.nextToken());
//        }
//        System.out.println("¨¨¨¨¨¨¨ actividades extra ¨¨¨¨¨¨¨");
//        System.out.println("\n");
//        System.out.println("Usar tokenizer en FileReader");
//        System.out.println("########");
//        try{
//            FileReader f2 = new FileReader("archivo.txt");
//            BufferedReader b2 = new BufferedReader(f2);
//            System.out.println("texto: ");
//            String p = b2.readLine();
//            StringTokenizer tok = new StringTokenizer(p, ",");
//            while(tok.hasMoreTokens()){
//                System.out.println(tok.nextToken());
//            }
//            System.out.println("########");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.out.println("~~~~~~~ almacen de objetos ~~~~~~~");
        LinkedList<Alumno> alum = new LinkedList<>();
        try{
            FileReader op = new FileReader("objAlu.csv");
            BufferedReader b3 = new BufferedReader(op);
            String lA = b3.readLine();
            while(lA != null){
                lA = b3.readLine();
                if(lA == null)
                    break;
                StringTokenizer tok = new StringTokenizer(lA, ",");
                //random alumnos in LinkedList
                Alumno alumno = new Alumno();
                int i = 0;
                while(tok.hasMoreTokens()){
                    String key = tok.nextToken();
                    switch (i){
                        case 0:
                            alumno.setNombre(key);
                            break;
                        case 1:
                            alumno.setApPat(key);
                            break;
                        case 2:
                            alumno.setApMat(key);
                            break;
                        case 3:
                            alumno.setNumCuenta(Integer.valueOf(key));
                            break;
                        case 4:
                            alumno.setEdad(Integer.valueOf(key));
                            break;
                    }
                    if (i == 4)
                        alum.add(alumno);
                    else
                        i++;
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Alumno alumno : alum) {
            System.out.println(alumno.getNombre() + ", " + alumno.getApPat() + ", " + alumno.getApMat() + ", " + alumno.getNumCuenta() + ", " + alumno.getEdad());
        }

    }
}
