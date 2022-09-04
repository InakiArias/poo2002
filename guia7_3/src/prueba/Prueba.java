package prueba;

import conjuntos.OperacionInvalidaException;
import modelo.LineaPedido;
import modelo.Pedido;
import modelo.Producto;
import modelo.Proveedor;

public class Prueba {

    public static void main(String[] args) {
        Proveedor prov = new Proveedor("Pepe", "223", "As.com");
        Pedido pedido = new Pedido(prov, "2/7");
        pedido.agregar(new LineaPedido(new Producto(2, "Arroz", 100), 10));
        pedido.agregar(new LineaPedido(new Producto(4, "Harina", 150), 30));
        pedido.agregar(new LineaPedido(new Producto(7, "Azucar", 150), 30));
        pedido.agregar(new LineaPedido(new Producto(9, "Lentejas", 150), 30));
        
        try {
            pedido.agregar(new LineaPedido(new Producto(4, "Harina", 150), 30));
        }
        catch (OperacionInvalidaException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\n" + pedido.listadoDetallado());
        

        
    }

}
