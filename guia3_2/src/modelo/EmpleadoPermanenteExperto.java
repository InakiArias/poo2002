package modelo;

public class EmpleadoPermanenteExperto extends EmpleadoPermanente {

    private static final double INCREMENTO_BASE = 0.5;
    private static final double INCREMENTO_POR_ANIO = 0.015;
    private static final String TIPO_EMPLEADO = "Permanente Experto";

    public EmpleadoPermanenteExperto(String nombre, int legajo, String domicilio, int antiguedad, double sueldoBase) {
        super(nombre, legajo, domicilio, antiguedad, sueldoBase);
    }

    @Override
    protected double calcularSueldoBruto() {
        double plus = INCREMENTO_BASE + INCREMENTO_POR_ANIO * this.getAntiguedad();

        return this.getSueldoBase() * (1 + plus);
    }

    @Override
    public String getTipoEmpleado() {
        return EmpleadoPermanenteExperto.TIPO_EMPLEADO;
    }

}
