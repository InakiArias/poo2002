package prueba;

import java.util.Iterator;
import java.util.function.Consumer;
import modelo.Categoria;
import modelo.Chofer;
import modelo.Colectivo;
import modelo.Domicilio;
import modelo.Empresa;

public class Prueba {

    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstance();

        empresa.addColectivo(new Colectivo("Modelo1"));
        empresa.addColectivo(new Colectivo("Modelo2"));

        empresa.addCategoria(new Categoria("Cat1", 1000));
        empresa.addCategoria(new Categoria("Cat2", 2000));

        empresa.addChofer(new Chofer("Pepe", empresa.getCategoria(0), new Domicilio("BsAs", 1000)));
        empresa.addChofer(new Chofer("Juan", empresa.getCategoria(1), new Domicilio("BsAs", 3000)));

        Colectivo col1 = empresa.getColectivo(0);
        Chofer chofer1 = empresa.getChofer(0);
        empresa.asignar(chofer1, col1);
        //empresa.desvincular(chofer1, col1);
        empresa.getColectivos().forEach(System.out::println);

        empresa.getCategorias().forEach(System.out::println);

        for (Chofer c : empresa.getChoferes()) {
            System.out.println(c);
        }

        System.out.println(empresa.cantChoferesCategoria(empresa.getCategoria(0)));
        System.out.println(empresa.cantChoferesSinAsignar());

    }

}
