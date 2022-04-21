import java.math.*;
public class Persona {
    String nombre, apellido;
    Float altura,  peso;
    public Persona() {
        this.nombre = nombre;
        this.apellido= apellido;
        this.altura= altura;
        this.peso = peso;
    }
    public void boxear(){
        System.out.println("boxeador: "+ nombre + " " + apellido);
        System.out.println("De peso: " + peso);
        System.out.println("Y de altura: " + altura);
        System.out.println("Peleara por el cinturon de oro");
    }
    public void comer(){
        float imcTotal = (float) (peso / Math.pow(altura, 2));
        System.out.println("Este es su indice de masa corporal de acuerdo a sus datos: "+ imcTotal);
        System.out.println("Tiene permitido comer una dieta omnivora\n por lo que comera una dieta equitativa en todos sus aspectos");
    }
}
