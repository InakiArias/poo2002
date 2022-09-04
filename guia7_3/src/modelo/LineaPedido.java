package modelo;

import java.util.Objects;

public class LineaPedido implements Comparable<LineaPedido> {
    private final Producto prod;
    private final int cant;

    public LineaPedido(Producto prod, int cant) {
        this.prod = prod;
        this.cant = cant;
    }

    public Producto getProd() {
        return prod;
    }

    public int getCant() {
        return cant;
    }

    @Override
    public String toString() {
        return "LineaPedido{" + "prod=" + prod + ", cant=" + cant + '}';
    }

    @Override
    public int compareTo(LineaPedido o) {
        return this.prod.getCodigo() - o.prod.getCodigo();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.prod);
        hash = 41 * hash + this.cant;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LineaPedido other = (LineaPedido) obj;
        if (this.cant != other.cant) {
            return false;
        }
        if (!Objects.equals(this.prod, other.prod)) {
            return false;
        }
        return true;
    }
}
