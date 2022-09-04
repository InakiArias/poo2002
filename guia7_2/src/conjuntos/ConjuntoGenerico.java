package conjuntos;

import java.util.Iterator;

public class ConjuntoGenerico<T> implements IConjunto<T>{
    private IConjunto<T> conjunto;

    public ConjuntoGenerico() {
        conjunto = new ConjuntoSet<>();
    }

    public ConjuntoGenerico(IConjunto<T> conjunto) {
        this.conjunto = conjunto;
    }
    
    @Override
    public void agregar(T t) {
        conjunto.agregar(t);
    }

    @Override
    public void eliminar(T t) {
        conjunto.eliminar(t);
    }

    @Override
    public int cantidad() {
        return conjunto.cantidad();
    }

    @Override
    public Iterator<T> getIterador() {
        return conjunto.getIterador();
    }
    
}
