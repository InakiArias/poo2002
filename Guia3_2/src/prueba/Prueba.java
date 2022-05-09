package prueba;

import modelo.Departamento;
import modelo.Empleado;
import modelo.EmpleadoPermanenteExperto;
import modelo.EmpleadoPermanenteIntermedio;
import modelo.EmpleadoPermanentePrincipiante;
import modelo.EmpleadoTemporario;

public class Prueba {

    public static void main(String[] args) {
        Empleado e;

        Departamento depMantenimiento = new Departamento("Mantenimiento");
        Departamento depContabilidad = new Departamento("Contabilidad");

        e = new EmpleadoPermanenteIntermedio("Juan Perez", 1234, "Matheu 2343", 7, 12000);
        depMantenimiento.agregarEmpleado(e);

        e = new EmpleadoTemporario("Julio Garcia", 3209, "Colon 5561", 80, 160);
        depMantenimiento.agregarEmpleado(e);

        e = new EmpleadoTemporario("Martin Rodríguez", 3210, "Mitre 3451", 70, 100);
        depMantenimiento.agregarEmpleado(e);

        e = new EmpleadoPermanenteExperto("Mara Anchorena", 9876, "Luro 3489,", 18, 13000);
        depContabilidad.agregarEmpleado(e);

        e = new EmpleadoPermanentePrincipiante("Sandra Fernández", 1276, "Córdoba 3843", 6, 11500);
        depContabilidad.agregarEmpleado(e);

        e = new EmpleadoPermanentePrincipiante("Luis Gómez", 1544, "Formosa 2354", 26, 10500);
        depContabilidad.agregarEmpleado(e);

        e = new EmpleadoPermanenteIntermedio("Lucas Benítez", 1634, "Castelli 4563", 12, 13000);
        depContabilidad.agregarEmpleado(e);

        System.out.println(depMantenimiento.listado());
        System.out.println(depContabilidad.listado());

    }

}
