package modelo;

public class CuentaBancaria {
    private double saldo;
    private final String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }
    
    public boolean extraer(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
}
