package prueba;

import modelo.Clase1;
import modelo.Clase2;
import modelo.Clase3;

public class Prueba {

    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        Clase1 c1 = c3;
        Clase2 c2 = c3;
        System.out.println(c1.metodo1()); //11
        c1.metodo2(); //clase 2 y clase 3
        c1.metodo3(); //clase 1 y clase 2
        c1.metodo4(); //clase 2
        System.out.println(c2.metodo1()); //11
        c2.metodo2(); //clase 2 y clase 3
        c2.metodo3(); //clase 1 y clase 2
        c2.metodo4(); //clase 2
        System.out.println(c3.metodo1()); // 11
        c3.metodo2(); //clase 2 y clase 3 
        c3.metodo3(); //clase 1 y clase 2
        c3.metodo4(); //clase 2
        System.out.println(c1.atributo); //1
        System.out.println(c2.atributo); //2
        System.out.println(c3.atributo); //3
        System.out.println(c1.getAtributo()); //3
        System.out.println(c2.getAtributo()); //3
        System.out.println(c3.getAtributo()); //3    
    }

}
