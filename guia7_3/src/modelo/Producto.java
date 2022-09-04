package modelo;

public class Producto {
    private final int codigo;
    private String desc;
    private double precio;

    public Producto(int codigo, String desc, double precio) {
        this.codigo = codigo;
        this.desc = desc;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", desc=" + desc + ", precio=$" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codigo;
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
