package modelo;

public class Acoplado {
    protected double tara;
    protected double cargaMaxima;
    protected boolean refrigerado;
    protected int numeroAcoplado;
    protected boolean enUso;
    
    private static int ultNumero = 0;

    public Acoplado(double tara, double cargaMaxima, boolean refrigerado) {
        this.tara = tara;
        this.cargaMaxima = cargaMaxima;
        this.refrigerado = refrigerado;
        this.numeroAcoplado = ++ultNumero;
    }

    @Override
    public String toString() {
        return "Acoplado{" + "tara=" + tara + ", cargaMaxima=" + cargaMaxima + ", refrigerado=" + refrigerado + ", numeroAcoplado=" + numeroAcoplado + ", enUso=" + enUso + '}';
    }
    
    
    
}
