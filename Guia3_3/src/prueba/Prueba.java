package prueba;

import modelo.AutomovilAutomatico;

public class Prueba {

    public static void main(String[] args) {
        AutomovilAutomatico auto = new AutomovilAutomatico("Pat", 230);
        
        for (int i = 0; i < 10; i++) {
            auto.acelerar(i * 7);
            System.out.println(auto);
        }
        
        auto.activarReversa();
        
        for (int i = 0; i < 10; i++) {
            auto.frenar(i * 8);
            System.out.println(auto);
        }
        
        auto.activarReversa();
        
        for (int i = 0; i < 7; i++) {
            auto.acelerar(i * 7);
            System.out.println(auto);
        }
        
        for (int i = 0; i < 6; i++) {
            auto.frenar(i * 8);
            System.out.println(auto);
        }
        
        auto.desactivarReversa();
        System.out.println(auto);
    }

}
