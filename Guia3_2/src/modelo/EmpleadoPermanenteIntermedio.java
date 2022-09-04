package modelo;

public class EmpleadoPermanenteIntermedio extends EmpleadoPermanente {

    private static final double INCREMENTO_BASE = 0.25;
    private static final double INCREMENTO_POR_ANIO = 0.01;
    private static final String TIPO_EMPLEADO = "Permanente Intermedio";

    public EmpleadoPermanenteIntermedio(String nombre, int legajo, String domicilio, int antiguedad, double sueldoBase) {
        super(nombre, legajo, domicilio, antiguedad, sueldoBase);
    }

    @Override
    protected double calcularSueldoBruto() {
        double plus = INCREMENTO_BASE + INCREMENTO_POR_ANIO * this.getAntiguedad();

        return this.getSueldoBase() * (1 + plus);
    }

    @Override
    public String getTipoEmpleado() {
        return EmpleadoPermanenteIntermedio.TIPO_EMPLEADO;
    }

}
