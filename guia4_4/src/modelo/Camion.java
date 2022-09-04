package modelo;

public class Camion extends Vehiculo {

    protected double tara;
    protected double cargaMaxima;
    protected Acoplado acoplado;

    public Camion(double tara, double cargaMaxima, String modelo) {
        super(modelo);
        this.tara = tara;
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().habilitaCamion;
    }

    @Override
    public String toString() {
        return super.toString() + ", tara=" + tara + ", cargaMaxima=" + cargaMaxima + ", acoplado=" + acoplado + '}';
    }
    
    
}
