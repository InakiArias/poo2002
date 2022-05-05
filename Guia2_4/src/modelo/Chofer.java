package modelo;

public class Chofer {

    private String nombre;
    private Categoria categoria;
    private Domicilio domicilio;
    private Colectivo colectivoAsignado;

    public Chofer(String nombre, Categoria categoria, Domicilio domicilio) {
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Colectivo getColectivoAsignado() {
        return colectivoAsignado;
    }

    public void setColectivoAsignado(Colectivo colectivoAsignado) {
        this.colectivoAsignado = colectivoAsignado;
    }

    @Override
    public String toString() {
        return "Chofer{" + "nombre=" + nombre + ", categoria=" + categoria + ", domicilio=" + domicilio + ", colectivoAsignado=" + colectivoAsignado + '}';
    }

}
