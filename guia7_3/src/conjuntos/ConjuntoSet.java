package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConjuntoSet<T> implements IConjunto<T> {

    Set<T> conjunto;

    public ConjuntoSet() {
        conjunto = new HashSet<>();
    }
    
    public ConjuntoSet(Set<T> conjunto) {
        this.conjunto = conjunto;
    }
    
    @Override
    public void agregar(T t) {
        if (conjunto.contains(t))
            throw new OperacionInvalidaException("Se quiso agregar objeto ya existente", t, "Se quiso agregar objeto ya existente: " + t);
        
        conjunto.add(t);
    }

    @Override
    public void eliminar(T t) {
        if (!conjunto.contains(t))
            throw new OperacionInvalidaException("Se quiso eliminar objeto no existente", t, "Se quiso eliminar objeto no existente: " + t);

        conjunto.remove(t);
    }

    @Override
    public int cantidad() {
        return conjunto.size();
    }

    @Override
    public Iterator<T> getIterador() {
        return conjunto.iterator();
    }
    
}
