package conjuntos;

import java.util.TreeSet;

public class ConjuntoGenericoOrdenado<T extends Comparable<T>> extends ConjuntoGenerico<T> {

    public ConjuntoGenericoOrdenado() {
        super(new ConjuntoSet<>(new TreeSet<>()));
    }

    public ConjuntoGenericoOrdenado(IConjunto<T> conjunto) {
        super(conjunto);
    }
    
}
