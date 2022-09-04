package modelo;

import java.util.HashMap;

public class TablaCapacidades {

    private final static HashMap<String, Double> CAPACIDADES;

    static {
        CAPACIDADES = new HashMap<>();
        CAPACIDADES.put("Café", 1500.0);
        CAPACIDADES.put("Té", 1000.0);
        CAPACIDADES.put("Cacao", 600.0);
        CAPACIDADES.put("Crema", 600.0);
        CAPACIDADES.put("Leche", 600.0);
        CAPACIDADES.put("Yerba", 2000.0);
    }

    public static double getCapMax(String ingrediente) {
        return CAPACIDADES.get(ingrediente);
    }
}
