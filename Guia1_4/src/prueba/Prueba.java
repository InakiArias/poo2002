package prueba;

import modelo.Complejo;

public class Prueba {

    public static void main(String[] args) {
        Complejo c1 = new Complejo(-3, 4);
        Complejo c2 = new Complejo(0, 4);
        
        System.out.println(c1.argumento());
        System.out.println(c1.modulo());
        System.out.println(c1.producto(c2));
        System.out.println(c1.productoPorReal(3));
        System.out.println(c1.resta(c2));
        System.out.println(c1.suma(c2));
        System.out.println(c1.division(c1));





    }

}
