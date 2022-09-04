package prueba;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;
import modelo.Persona;
import utils.Ordenadora;

public class Prueba {

    public static void main(String[] args) {
        Persona[] personas = {
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
        
        for (Persona p : personas) {
            System.out.println(p);
        }
        
        System.out.println();
        
        Ordenadora.ordenar(personas);
        
        for (Persona p : personas) {
            System.out.println(p);
        }
        
        HashSet<Persona> hs = new HashSet<>(Arrays.asList(personas));
        
        System.out.println("\nHash Set");
        
        for (Persona p : hs) {
            System.out.println(p);
        }
        
        TreeSet<Persona> ts = new TreeSet<>(Arrays.asList(personas));
        
        System.out.println("\nTree Set");
        
        for (Persona p : ts) {
            System.out.println(p);
        }
    }

}
