package modelo;

public class ColectivoLarga extends Colectivo {
    protected boolean cocheCama;

    public ColectivoLarga(boolean cocheCama, int cantPasajeros, String modelo) {
        super(cantPasajeros, modelo);
        this.cocheCama = cocheCama;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().habilitaColectivoLarga;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Coche cama: " + cocheCama;
    }
    
    
    
}
