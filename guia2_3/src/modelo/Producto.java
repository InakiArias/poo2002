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
        return "Producto{" + "codigo=" + codigo + ", desc=" + desc + ", precio=" + precio + '}';
    }
}
