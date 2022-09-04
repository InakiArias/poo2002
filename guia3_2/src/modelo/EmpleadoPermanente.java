package modelo;

public abstract class EmpleadoPermanente extends Empleado {

    private final static double APORTE_JUBILATORIO = 0.11;
    private final static double OBRA_SOCIAL = 0.06;

    private int antiguedad;
    private double sueldoBase;

    public EmpleadoPermanente(String nombre, int legajo, String domicilio, int antiguedad, double sueldoBase) {
        super(nombre, legajo, domicilio);
        this.antiguedad = antiguedad;
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    protected void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    protected void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    protected abstract double calcularSueldoBruto();

    @Override
    public double calcularSueldo() {
        double sueldo = this.calcularSueldoBruto() * (1 - APORTE_JUBILATORIO - OBRA_SOCIAL);
        sueldo = Math.round(sueldo * 100.0) / 100.0;
        
        return sueldo;
    }

}
