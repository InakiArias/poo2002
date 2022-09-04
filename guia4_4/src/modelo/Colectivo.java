package modelo;

public abstract class Colectivo extends Vehiculo {
    protected int cantPasajeros;

    public Colectivo(int cantPasajeros, String modelo) {
        super(modelo);
        this.cantPasajeros = cantPasajeros;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + " CantP: " + cantPasajeros;
    }
    
    
    
    
    

}
