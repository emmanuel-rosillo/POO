import com.mycompany.javasc.vars;

public class mainto {

    static float g2 = 19.999f;

    public static void main(String[] args) {
        int g = 999;
        int g3 = 1999;
        int var1 = 5;
        int var2 = 7;
        int x;
        boolean y;
        x = vars.suma(var1, var2);
        y = vars.resta(g, g3);
        System.out.println("ya deja de llorar, esto es tu suma: " + x);
        System.out.println("esto es un flotante:" + g2);
        System.out.println("esto es un booleano:" + y);
    }
}
