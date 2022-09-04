package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class MaquinaExpendedora {

    private final String nombre;
    protected HashMap<String, Deposito> depositos = new HashMap<>();
    
    public MaquinaExpendedora(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    protected void creaDeposito(Ingrediente ingrediente, double cantInicial) {
        double capMax = TablaCapacidades.getCapMax(ingrediente.getNombre());
        Deposito d = new Deposito(ingrediente.getNombre(), cantInicial, capMax);
        
        this.depositos.put(ingrediente.getNombre(), d);
    }
    
    public double cargar(Ingrediente ingrediente, double cant) {
        return depositos.get(ingrediente.getNombre()).cargar(cant);
    }
    
    public Infusion prepararInfusion(String nombreInfusion) {
        HashMap<String, Double> ingredientes = TablaInfusiones.getIngredientes(nombreInfusion);
        
        for (String ingrediente : ingredientes.keySet()) {
            Deposito d = this.depositos.get(ingrediente);
            Double cant = ingredientes.get(ingrediente);
            
            if (d.getCantDisponible() < cant) {
                return null;
            }
        }
        
        for (String ingrediente : ingredientes.keySet()) {
            Deposito d = this.depositos.get(ingrediente);
            Double cant = ingredientes.get(ingrediente);
            
            d.descargar(cant);
        }
        
        return new Infusion(nombreInfusion);
        
    }
    
    public String detalleDepositos() {
        String res = "";
        
        ArrayList<String> a = new ArrayList<>(this.depositos.keySet());
        Collections.sort(a);
        
        for (String ingrediente : a) {
            res += ingrediente + ": " + (int) this.depositos.get(ingrediente).getCantDisponible() + "\n";
        }
        
        return res;
    }
    
    public boolean depositoLleno(String ingrediente) {
        return this.depositos.get(ingrediente).lleno();
    }
    
    @Override
    public String toString() {
        return "MaquinaExpendedora{" + "nombre=" + nombre + ", depositos=" + depositos + '}';
    }
    
}
