package modelo;

public class Persona implements Comparable<Persona> {

    private long dni;
    private String apellido;
    private String nombre;
    private String direccion;

    public Persona(long dni, String apellido, String nombre, String direccion) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public long getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int compareTo(Persona o) {
        return (int) (dni - o.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " - Apellido: " + apellido + " - Nombre: " + nombre + " - Direccion: " + direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.dni ^ (this.dni >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Persona other = (Persona) obj;

        return this.dni == other.dni;
    }

}
