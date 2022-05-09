package modelo;

public class EmpleadoTemporario extends Empleado {

    private double sueldoHora;
    private int horasTrabajo;

    public EmpleadoTemporario(String nombre, int legajo, String domicilio, double sueldoHora, int horasTrabajo) {
        super(nombre, legajo, domicilio);
        this.sueldoHora = sueldoHora;
        this.horasTrabajo = horasTrabajo;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    protected void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    protected void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajo * this.sueldoHora;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporario{" + super.toString() + ", sueldoHora=" + sueldoHora + ", horasTrabajo=" + horasTrabajo + '}';
    }

}
