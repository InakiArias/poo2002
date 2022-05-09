package modelo;

public class EmpleadoPermanentePrincipiante extends EmpleadoPermanente {

    public EmpleadoPermanentePrincipiante(String nombre, int legajo, String domicilio, int antiguedad, double sueldoBase) {
        super(nombre, legajo, domicilio, antiguedad, sueldoBase);
    }

    private static double calcularPlus(int antiguedad) {
        if (antiguedad < 2) {
            return 0;
        }
        else if (antiguedad < 5) {
            return 0.05;
        }
        else if (antiguedad < 10) {
            return 0.07;
        }
        else if (antiguedad < 15) {
            return 0.1;
        }
        else if (antiguedad < 20) {
            return 0.15;
        }
        else {
            return 0.2;
        }
    }

    @Override
    protected double calcularSueldoBruto() {
        double plus = calcularPlus(this.getAntiguedad());

        return this.getSueldoBase() * (1 + plus);
    }

}
