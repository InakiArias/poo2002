package ejabstractastema3;

public class Prueba
{

    public static void main(String[] args)
    {        
        Empleado a = new Empleado("Juan", 5000);
        Empleado b = new Empleado("Mariano", 5000.5);
        Empleado c = new Empleado("Laura", 4000);
        Empleado d = new Empleado("Rocío", 6000);
        Empleado e = new Empleado("Pedro", 10000);
        Empleado[] empleados = new Empleado[5];
        empleados[0] = a;
        empleados[1] = b;
        empleados[2] = c;
        empleados[3] = d;
        empleados[4] = e;

        mostrar(empleados);
        Ordenable.ordenar_seleccion(empleados);
        System.out.println("----");
        mostrar(empleados);
    }

    private static void mostrar(Empleado[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
