package modelo;

public class Categoria {
    private final String nombre;
    private double sueldo;

    public Categoria(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    
}
