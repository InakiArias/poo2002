package prueba;

import modelo.CuentaBancaria;

public class Prueba {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pepe");
        
        System.out.println(cuenta);
        
        cuenta.depositar(100);
        
        System.out.println(cuenta);
        
        System.out.println(cuenta.extraer(80));
        
        System.out.println(cuenta);
    }
    
    

}
