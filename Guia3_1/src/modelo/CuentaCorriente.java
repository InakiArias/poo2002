package modelo;

public class CuentaCorriente extends CuentaBancaria {
    private double topeDescubierto;
    
    public CuentaCorriente(String titular) {
        super(titular);
    }
    
    public CuentaCorriente(String titular, double topeDescubierto) {
        super(titular);
        this.topeDescubierto = topeDescubierto;
    }

    public double getTopeDescubierto() {
        return topeDescubierto;
    }

    public void setTopeDescubierto(double topeDescubierto) {
        this.topeDescubierto = topeDescubierto;
    }

    @Override
    public boolean extraer(double monto) {
        boolean sePuedeExtraer = this.saldo - monto >= -this.topeDescubierto;
        
        if (sePuedeExtraer) {
            this.saldo -= monto;
            return true;
        }
        else {
            return false;
        }
    }


    

    
}
