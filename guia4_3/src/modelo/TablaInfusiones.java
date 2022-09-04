package modelo;

import java.util.HashMap;

public class TablaInfusiones {

    private final static HashMap<String, HashMap<String, Double>> INFUSIONES;

    static {
        INFUSIONES = new HashMap<>();
        HashMap<String, Double> aux;

        aux = new HashMap<>();
        aux.put("Café", 40.0);
        INFUSIONES.put("Café", aux);

        aux = new HashMap<>();
        aux.put("Café", 30.0);
        aux.put("Leche", 20.0);
        INFUSIONES.put("Café con leche", aux);

        aux = new HashMap<>();
        aux.put("Té", 20.0);
        INFUSIONES.put("Té", aux);

        aux = new HashMap<>();
        aux.put("Té", 20.0);
        aux.put("Leche", 20.0);
        INFUSIONES.put("Té con leche", aux);
        
        aux = new HashMap<>();
        aux.put("Café", 30.0);
        aux.put("Cacao", 10.0);
        aux.put("Crema", 30.0);
        INFUSIONES.put("Capuchino", aux);
        
        aux = new HashMap<>();
        aux.put("Cacao", 40.0);
        aux.put("Leche", 50.0);
        INFUSIONES.put("Chocolate", aux);
        
        aux = new HashMap<>();
        aux.put("Yerba", 20.0);
        INFUSIONES.put("Mate cocido", aux);
        
        aux = new HashMap<>();
        aux.put("Yerba", 20.0);
        aux.put("Leche", 20.0);
        INFUSIONES.put("Mate cocido con leche", aux);
    }

    public static HashMap<String, Double> getIngredientes(String infusion) {
        return INFUSIONES.get(infusion);
    }
}
