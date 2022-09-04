package prueba;

import conjuntos.ConjuntoGenerico;
import conjuntos.ConjuntoGenericoOrdenado;
import conjuntos.OperacionInvalidaException;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Persona;

public class Prueba {

    static Persona[] personas = {
        new Persona(13123123, "Pérez", "Jorge", "Juan B Justo 1234"),
        new Persona(13123123, "Pérez", "Jorge", "Juan B Justo 1234"),
        new Persona(13123123, "Benítez", "Joaquín", "Córdoba 4321"),
        new Persona(12456789, "Finos", "Juana", "Colón 1357"),
        new Persona(14567891, "Roble", "Lucía", "Edison 9512"),
        new Persona(14954985, "Roble", "Lucía", "Edison 9512"),
        new Persona(44989598, "Iniesta", "Mariano", "Corrientes 3846"),
        new Persona(44989598, "Chico", "Gimena", "Almafuerte 1499"),
        new Persona(96151965, "Quiroga", "Gloria", "Almafuerte 1499"),
        new Persona(29899622, "Ubeda", "Lucas", "Paunero 3166"),
        new Persona(26484631, "Villalba", "Jaime", "Tucumán 2360")
    };

    public static void main(String[] args) {
        prueba1();
        prueba2();
    }

    public static void prueba1() {
        System.out.println("\nPrueba Conjunto Generico\n");
        
        ConjuntoGenerico<Persona> conjunto = new ConjuntoGenerico<>();

        for (Persona p : personas) {
            try {
                conjunto.agregar(p);
            }
            catch (OperacionInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            conjunto.eliminar(personas[0]);
            conjunto.eliminar(personas[1]);
        }
        catch (OperacionInvalidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        Iterator<Persona> it = conjunto.getIterador();

        while (it.hasNext()) {
            Persona p = it.next();
            System.out.println(p);
        }
    }

    public static void prueba2() {
        System.out.println("\nPrueba Conjunto Generico Ordenado\n");
        
        ConjuntoGenerico<Persona> conjunto = new ConjuntoGenericoOrdenado<>();
 
        for (Persona p : personas) {
            try {
                conjunto.agregar(p);
            }
            catch (OperacionInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            conjunto.eliminar(personas[0]);
            conjunto.eliminar(personas[1]);
        }
        catch (OperacionInvalidaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        Iterator<Persona> it = conjunto.getIterador();

        while (it.hasNext()) {
            Persona p = it.next();
            System.out.println(p);
        } 
    }

}
