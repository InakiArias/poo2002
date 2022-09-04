package prueba;

import modelo.Acoplado;
import modelo.Camion;
import modelo.Colectivo;
import modelo.ColectivoLarga;
import modelo.ColectivoLinea;
import modelo.Empresa;

public class Prueba {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empresa.iniciaCategorias(empresa);
        
        Acoplado a = new Acoplado(100, 100, true);
        
        Camion c = new Camion(200, 200, "as");

        empresa.addVehiculo(c);
        empresa.addAcoplado(a);
        empresa.asignarAcoplado(a, c);
        
        System.out.println(empresa);
    }

}
