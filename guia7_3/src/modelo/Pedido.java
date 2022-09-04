package modelo;

import conjuntos.ConjuntoGenericoOrdenado;
import java.util.Iterator;

public class Pedido extends ConjuntoGenericoOrdenado<LineaPedido> {

    private final Proveedor prov;
    private final String fecha;

    public Pedido(Proveedor prov, String fecha) {
        super();
        this.prov = prov;
        this.fecha = fecha;
    }

    public Proveedor getProv() {
        return prov;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pedido{" + "prov=" + prov + ", fecha=" + fecha + '}';
    }

    public String listadoDetallado() {
        String res = "Pedido de: " + prov + " | Fecha=" + fecha + ":\n\n";
        
        Iterator<LineaPedido> it = this.getIterador();
        
        while (it.hasNext()) {
            LineaPedido next = it.next();
            res += "- " + next + "\n";
        }
        
        return res + "\nTotal: $" + this.precioTotal();
    }

    private double precioTotal() {
        double res = 0;
        
        Iterator<LineaPedido> it = this.getIterador();
        
        while (it.hasNext()) {
            LineaPedido next = it.next();
            res += next.getProd().getPrecio() * next.getCant();
        }
        
        return res;
    }
}
