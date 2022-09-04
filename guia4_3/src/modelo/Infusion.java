package modelo;

public class Infusion {
    private final String nombre;
    
    public Infusion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }    

    @Override
    public String toString() {
        return "Infusion{" + "nombre=" + nombre + '}';
    }
}
