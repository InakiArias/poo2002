package conjuntos;

import java.util.Iterator;

public interface IConjunto<T> {

    void agregar(T t);

    void eliminar(T t);

    int cantidad();

    Iterator<T> getIterador();

}
