package prueba;

import modelo.Complejo;
import modelo.Cuadratica;

public class Prueba {

    public static void main(String[] args) {
        Cuadratica cuad = new Cuadratica(3, 12, 1);

        System.out.println(cuad.getXv());
        System.out.println(cuad.getYv());

        Complejo[] raicesComplejas = cuad.raicesComplejas();

        for (Complejo c : raicesComplejas) {
            System.out.println(c);
        }

        double[] raices = cuad.raices();

        if (raices != null) {
            for (double d : raices) {
                System.out.println(d);
            }
        }
    }

}
