package modelo;

public class Domicilio {
    
    private final String calle;
    private final int numero;

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + '}';
    }
}
