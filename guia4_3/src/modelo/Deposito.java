package modelo;

import java.util.HashMap;

public class Deposito {
    private final String ingrediente;
    private double cantDisponible;
    private final double capacidadMax;

    public Deposito(String ingrediente, double cantDisponible, double capacidadMax) {
        this.ingrediente = ingrediente;
        this.cantDisponible = cantDisponible;
        this.capacidadMax = capacidadMax;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public double getCantDisponible() {
        return cantDisponible;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public double cargar(double cant) {
        double nuevaCant = this.cantDisponible + cant;
        double exceso = nuevaCant - this.capacidadMax;

        if (exceso > 0) {
            this.cantDisponible = this.capacidadMax;
            return exceso;
        }
        else {
            this.cantDisponible = nuevaCant;
            return 0;
        }
    }

    public boolean descargar(double cant) {
        double nuevaCant = this.cantDisponible - cant;

        if (nuevaCant < 0) {
            return false;
        }
        else {
            this.cantDisponible = nuevaCant;
            return true;
        }
    }
    
    public boolean lleno() {
        return this.cantDisponible == this.capacidadMax;
    }

    @Override
    public String toString() {
        return "Deposito{" + "ingrediente=" + ingrediente + ", cantDisponible=" + cantDisponible + ", capacidadMax=" + capacidadMax + '}';
    }

}
