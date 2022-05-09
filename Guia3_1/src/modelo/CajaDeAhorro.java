package modelo;

public class CajaDeAhorro extends CuentaBancaria {

    private static int cantMaxExtracciones = 30;
    private int cantExtracciones;

    public CajaDeAhorro(String titular) {
        super(titular);
    }

    public static int getCantMaxExtracciones() {
        return cantMaxExtracciones;
    }

    public static void setCantMaxExtracciones(int cantMaxExtracciones) {
        CajaDeAhorro.cantMaxExtracciones = cantMaxExtracciones;
    }

    public int getCantExtracciones() {
        return cantExtracciones;
    }

    public void actualizarMes() {
        this.cantExtracciones = 0;
    }

    @Override
    public boolean extraer(double monto) {
        boolean sePuedeExtraer = this.saldo - monto >= 0 && cantExtracciones < cantMaxExtracciones;

        if (sePuedeExtraer) {
            this.saldo -= monto;
            this.cantExtracciones++;
            return true;
        }
        else {
            return false;
        }
    }

}
