package modelo;

public abstract class Empleado {
    private String nombre;    
    private final int legajo;
    private String domicilio;

    public Empleado(String nombre, int legajo, String domicilio) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", legajo=" + legajo + ", domicilio=" + domicilio + ", tipo=" + this.getTipoEmpleado();
    }
    
    public abstract double calcularSueldo();
    public abstract String getTipoEmpleado();
    
}
