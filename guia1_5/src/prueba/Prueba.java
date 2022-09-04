package prueba;

import modelo.Juego;

public class Prueba {
    private final static int CANT_INTENTOS_MAX = 20;
    private final static int CANT_DIGITOS = 4;

    public static void main(String[] args) {
        Juego juego = new Juego(CANT_INTENTOS_MAX, CANT_DIGITOS);
        
        juego.jugar();
    }
}
