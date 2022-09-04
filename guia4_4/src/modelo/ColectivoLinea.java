package modelo;

public class ColectivoLinea extends Colectivo {

    public ColectivoLinea(int cantPasajeros, String modelo) {
        super(cantPasajeros, modelo);
    }

    @Override
    public boolean aceptoChofer(Chofer chofer) {
        return chofer.getCategoria().habilitaColectivoLinea;
    }
    
}
