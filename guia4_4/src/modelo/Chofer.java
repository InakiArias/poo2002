package modelo;

public class Chofer {

    private String nombre;
    private Categoria categoria;
    private String domicilio;
    private Vehiculo vehiculoAsignado;

    public Chofer(String nombre, Categoria categoria, String domicilio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }

    @Override
    public String toString() {
        return "Chofer{" + "nombre=" + nombre + ", categoria=" + categoria + ", domicilio=" + domicilio + ", colectivoAsignado=" + vehiculoAsignado + '}';
    }

}
