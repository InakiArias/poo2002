package modelo;

public class Colectivo {

    private final String modelo;
    private int numero;
    private boolean asignado;

    public Colectivo(String modelo) {
        this.modelo = modelo;
        this.asignado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Colectivo{" + "modelo=" + modelo + ", numero=" + numero + ", asignado=" + asignado + '}';
    }
    
    
    

}
