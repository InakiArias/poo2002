package prueba;

import modelo.MaquinaExpendedora;
import modelo.MaquinaExpendedoraTipo1;
import modelo.MaquinaExpendedoraTipo2;
import modelo.MaquinaExpendedoraTipo3;


public class Prueba {

    public static void main(String[] args) {
        MaquinaExpendedora m3 = new MaquinaExpendedoraTipo3("asd", 200);
        System.out.println(m3.prepararInfusion("Mate cocido"));
        System.out.println(m3.detalleDepositos());
        
        MaquinaExpendedora m2 = new MaquinaExpendedoraTipo2("asd", 300, 300, 300, 300);
        System.out.println(m2.prepararInfusion("Café"));
        System.out.println(m2.prepararInfusion("Capuchino"));
        System.out.println(m2.prepararInfusion("Té"));
        System.out.println(m2.detalleDepositos());
        
        MaquinaExpendedora m1 = new MaquinaExpendedoraTipo1("asd", 300, 300, 300, 300);
        System.out.println(m1.prepararInfusion("Café"));
        System.out.println(m1.prepararInfusion("Chocolate"));
        System.out.println(m1.prepararInfusion("Té"));
        System.out.println(m1.prepararInfusion("Café con leche"));
        System.out.println(m1.prepararInfusion("Té con leche"));
        System.out.println(m1.detalleDepositos());
        
    }

}
