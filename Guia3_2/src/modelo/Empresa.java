package modelo;

import java.util.HashMap;

public class Empresa {
    private String nombre;
    private final HashMap<String, Departamento> departamentos = new HashMap<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean addDepartamento(Departamento departamento) {
        if (this.departamentos.get(departamento.getNombre()) == null) {
            this.departamentos.put(departamento.getNombre(), departamento);
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public String listadoDetallado() {
        String res = "";
        
        for (Departamento departamento : departamentos.values()) {
            res += departamento.listado();
        }
        
        return res;
    }
    
    public String listado() {
        String res = "";
        
        for (Departamento departamento : departamentos.values()) {
            res += "- Departamento de " + departamento.getNombre() + "\n";
        }
        
        return res;
    }
}
