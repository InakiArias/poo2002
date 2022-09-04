package modelo;

public abstract class Vehiculo {
    protected final String modelo;
    protected int numeroInterno;
    
    protected static int ultNumero = 0;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.numeroInterno = ++ultNumero;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroInterno() {
        return numeroInterno;
    }
    
    public abstract boolean aceptoChofer(Chofer chofer);

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", numeroInterno=" + numeroInterno + '}';
    }
    
    
}
