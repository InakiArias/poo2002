package modelo;

public class EmpleadoFactory {

    public static EmpleadoPermanente getEmpleadoPermanente(String tipoEmpleadoPermanente, String nombre, int legajo, String domicilio, int antiguedad, double sueldoBase) {
        if (tipoEmpleadoPermanente == null)
            return null;
        else if (tipoEmpleadoPermanente.equals("Permanente Principiante"))
            return new EmpleadoPermanentePrincipiante(nombre, legajo, domicilio, antiguedad, sueldoBase);
        else if (tipoEmpleadoPermanente.equals("Permanente Intermedio"))
            return new EmpleadoPermanenteIntermedio(nombre, legajo, domicilio, antiguedad, sueldoBase);
        else if (tipoEmpleadoPermanente.equals("Permanente Experto"))
            return new EmpleadoPermanenteExperto(nombre, legajo, domicilio, antiguedad, sueldoBase);
        
        return null;
    }

    public static EmpleadoTemporario getEmpleadoTemporario(String nombre, int legajo, String domicilio, double sueldoHora, int horasTrabajo) {
        return new EmpleadoTemporario(nombre, legajo, domicilio, sueldoHora, horasTrabajo);
    }
}
