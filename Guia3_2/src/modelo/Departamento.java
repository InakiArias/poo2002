package modelo;

import java.util.ArrayList;

public class Departamento {
    private final String nombre;
    private final ArrayList<Empleado> empleados = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public boolean quitarEmpleado(int legajo) {
        int i = 0;

        while (i < this.empleados.size() && legajo != this.empleados.get(i).getLegajo()) {
            i++;
        }
        
        if (i < this.empleados.size()) {
            this.empleados.remove(i);
            return true;
        }
        else {
            return false;
        }
    }
    
    public String listado() {
        String res = "Departamento de " + this.nombre + ":\n";
        
        for (Empleado empleado : empleados) {
            res += "- " + empleado.getNombre() + ": $" + empleado.calcularSueldo() + "\n";
        }
        
        return res;
    }

}
