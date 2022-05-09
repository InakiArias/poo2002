package modelo;

import java.util.Calendar;

public class CuentaUniversitaria extends CuentaBancaria {

    private static double montoDiarioTope = 1500;
    private Calendar fecha;

    private double montoDiarioActual;

    public CuentaUniversitaria(String titular) {
        super(titular);
        this.montoDiarioActual = 0;
        this.fecha = Calendar.getInstance();
    }

    public CuentaUniversitaria(String titular, double montoDiarioActual) {
        this(titular);
        this.montoDiarioActual = montoDiarioActual;
    }

    public static double getMontoDiarioTope() {
        return montoDiarioTope;
    }

    public static void setMontoDiarioTope(double montoDiarioTope) {
        CuentaUniversitaria.montoDiarioTope = montoDiarioTope;
    }

    public double getMontoDiarioActual() {
        return montoDiarioActual;
    }

    private void renovarMonto() {
        this.montoDiarioActual = 0;
    }

    private void verificarFecha() {
        int diasAnt = this.fecha.get(Calendar.DAY_OF_MONTH);
        int mesesAnt = this.fecha.get(Calendar.MONTH);
        int aniosAnt = this.fecha.get(Calendar.YEAR);

        this.fecha = Calendar.getInstance();

        int dias = this.fecha.get(Calendar.DAY_OF_MONTH);
        int meses = this.fecha.get(Calendar.MONTH);
        int anios = this.fecha.get(Calendar.YEAR);

        boolean fechaDif = diasAnt != dias || mesesAnt != meses || aniosAnt != anios;

        if (fechaDif) {
            this.renovarMonto();
        }
    }

    @Override
    public boolean extraer(double monto) {
        if (this.saldo >= monto) {
            this.verificarFecha();

            if (this.montoDiarioActual + monto <= CuentaUniversitaria.montoDiarioTope) {
                this.saldo -= monto;
                this.montoDiarioActual += monto;
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
