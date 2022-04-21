public class Perro {
    String raza, color, nombre;
    Float altura, peso;
    public Perro() {
        this.raza =raza;
        this.color=color;
        this.nombre =nombre;
        this.altura=altura;
        this.peso=peso;
    }

    public Perro(String raza, String color, String nombre, Float altura, Float peso) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }
    public void ladrar(){
        System.out.println("el perro " + nombre +" ladra muy "+ ladrido(nombre)+" porque es un " + raza);
    }
    public String ladrido (String nombre){
        if (nombre == "popis") {
            return ("Fuerte");
        }else if(nombre == "chuchito"){
            return ("bajito");
        }else if(nombre == "pipo"){
            return ("bajito");
        }
        return nombre;
    }
    public void comer(){
        System.out.println("el perro " + nombre + "come mucho porque su peso es" + peso + " y su altura es " + altura);
    }

}
