package modelo;

import java.util.ArrayList;

public class Pedido {
    private final Proveedor prov;
    private final String fecha;
    private final ArrayList<LineaPedido> lineas;

    public Pedido(Proveedor prov, String fecha) {
        this.prov = prov;
        this.fecha = fecha;
        this.lineas = new ArrayList<>();
    }

    public Proveedor getProv() {
        return prov;
    }

    public String getFecha() {
        return fecha;
    }

    public void addLineaPedido(LineaPedido lp){
        this.lineas.add(lp);
    }
    
    public LineaPedido getLineaPedido(int indice){
        return this.lineas.get(indice);
    }
    
    public int getCantLineas() {
        return this.lineas.size();
    }

    @Override
    public String toString() {
        return "Pedido{" + "prov=" + prov + ", fecha=" + fecha + '}';
    }

}
