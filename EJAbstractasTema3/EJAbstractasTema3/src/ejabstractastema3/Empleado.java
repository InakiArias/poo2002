package ejabstractastema3;

public class Empleado extends Ordenable
{

    private String nya;
    private double salario;

    public Empleado(String nya, double salario)
    {
        this.nya = nya;
        this.salario = salario;
    }

    @Override
    public String toString()
    {
        return "Nombre " + this.nya +
               "\nSalario $" + this.salario;
    }

    @Override
    public int compare(Ordenable b)
    {
        Empleado eb = (Empleado) b;
        //El (casteo) a int es necesario para indicar que queremos perder la precisión de los decimales (truncar)
        return (int) (this.salario - eb.salario);
    }

}
