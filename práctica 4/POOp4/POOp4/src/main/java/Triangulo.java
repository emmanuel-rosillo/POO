public class Triangulo {
    int base, altura;

    public Triangulo() {
        this.base = base;
        this.altura = altura;
    }
    public void perimetro() {
        int perimetro = base * 3;
        System.out.println("perimetro total: " + perimetro);
    }
    public void area(){
        int areaTotal = (base * altura)/2;
        System.out.println("area total: "+ areaTotal);
    }
}
