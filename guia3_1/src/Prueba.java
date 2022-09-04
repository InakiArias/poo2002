
import modelo.CajaDeAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaUniversitaria;

public class Prueba {

    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("Pepe", 1000);

        cuentaCorriente.depositar(1000);
        System.out.println(cuentaCorriente);

        cuentaCorriente.extraer(2001);
        System.out.println(cuentaCorriente);
        System.out.println("");

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro("Pepo");
        cajaDeAhorro.depositar(10000);

        for (int i = 0; i < 310; i++) {
            cajaDeAhorro.extraer(10);
        }

        System.out.println(cajaDeAhorro);

        cajaDeAhorro.actualizarMes();

        cajaDeAhorro.extraer(200);
        System.out.println(cajaDeAhorro);

        CuentaUniversitaria cuentaUniversitaria = new CuentaUniversitaria("Pepi");
        
    }

}
