package prueba;

import modelo.LineaPedido;
import modelo.Pedido;
import modelo.Producto;
import modelo.Proveedor;

public class Prueba {

    public static void main(String[] args) {
        Proveedor prov = new Proveedor("Pepe", "223", "As.com");
        Pedido pedido = new Pedido(prov, "2/7");
        pedido.addLineaPedido(new LineaPedido(new Producto(2, "Arroz", 100), 10));
        pedido.addLineaPedido(new LineaPedido(new Producto(4, "Harina", 150), 30));

        System.out.println(prov);
        
        for (int i = 0; i < pedido.getCantLineas(); i++)
            System.out.println(pedido.getLineaPedido(i));
       
    }

}
