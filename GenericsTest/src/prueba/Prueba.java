package prueba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>(Arrays.asList("Hola", "Adios", "Adios", "Hola"));
        ArrayList<Integer> listaIntegers = new ArrayList<>(Arrays.asList(2, 4, 9, 10, 23, 10));

        System.out.println(listaStrings);
        System.out.println(cuentaApariciones(listaStrings, "Adios"));

        System.out.println(listaIntegers);
        System.out.println(cuentaApariciones(listaIntegers, 2));
        
        List<Integer> i = Arrays.asList(2, 3, 4);
        
        met(i);
        met2(i);
        
    }

    public static <T> int cuentaApariciones(List<T> lista, T buscado) {
       return (int) lista.stream().filter(t -> t.equals(buscado)).count();
    }
    
    public static void met(List<?> t) {
        System.out.println(t);
    }
    
    public static <T> void met2(List<T> t) {
        System.out.println(t);
    }
    
    public static <T> void intercambia(T[] arr, int i, int j) {
        T aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}
