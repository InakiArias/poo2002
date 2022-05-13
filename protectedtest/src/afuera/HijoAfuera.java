package afuera;

import modelo.Padre;

public class HijoAfuera extends Padre {
    public void met(HijoAfuera h) {
        h.atr = 5; //ok, estoy dentro de una subclase hija de Padre
    }
    
    public void met(NietoAfuera n) {
        n.atr = 5; //ok, n es tipo NietoAfuera, que es subclase de la clase en la que estoy
    }
    
    public void met(Padre p) {
        p.atr = 3; //error, p no es de tipo HijoAfuera o subclase de HijoAfuera
    }
}
