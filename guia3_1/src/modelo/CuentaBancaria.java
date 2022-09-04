package modelo;

public abstract class CuentaBancaria {

    protected double saldo;
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

    public abstract boolean extraer(double monto);

    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }

}
