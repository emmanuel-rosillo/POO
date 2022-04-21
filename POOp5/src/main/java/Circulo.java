public class Circulo {
    static double PI = 3.1416;
    private double radio;

    public Circulo() {
        this.radio=radio;
    }

    public Circulo(double radio) {
        this.radio=radio;
    }

    public void perimetro(){
        double perimetroTotal = (radio + radio)*PI;
        System.out.println("perimetro: " + perimetroTotal);
    }
    public void area(){
        double areaTotal = (radio * radio)*PI;
    }

    public void setRadio(double radio) {
        if(radio<0){
            this.radio = 1;
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio +'}';
    }
}
