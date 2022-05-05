package modelo;

public class LineaPedido {
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
}
