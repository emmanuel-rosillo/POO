
package com.mycompany.javasc;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opc = scan.nextInt();

        System.out.println("seleccione una opcion: ");
        switch (opc) {
            case 1:
                KeyboardInput.readInteger();
                break;
            case 2:
                KeyboardInput.readLong();
                break;

            case 3:
                KeyboardInput.readDouble();
                break;
            case 4:
                KeyboardInput.readFloat();
                break;
            case 5:
                KeyboardInput.readCharacter();
                break;
            case 6:
                KeyboardInput.readString();
                break;
                default:
                    System.out.println("opcion incorrecta");
                break;
        }
    }

}
