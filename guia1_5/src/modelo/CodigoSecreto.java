package modelo;

import java.util.ArrayList;
import java.util.Collections;

public class CodigoSecreto {
    private final String codigo;
    private final int numDigitos;

    public CodigoSecreto(int numDigitos) {
        this.numDigitos = numDigitos;
        this.codigo = generarCodigo();       
    }

    private String generarCodigo() {
        ArrayList<Integer> digitos = new ArrayList<>();
        
        for (int i = 0; i <= 9; i++)
            digitos.add(i);
        
        Collections.shuffle(digitos);
        
        String cod = "";
        
        for (int i = 0; i < this.numDigitos; i++)
            cod += digitos.get(i);
        
        return cod;   
    }
    
    public String adivinar(String intento) {
        int bien = 0;
        int regular = 0;
        
        for (int i = 0; i < this.numDigitos; i++) {
            if (intento.charAt(i) == this.codigo.charAt(i))
                bien++;
            else if (this.codigo.indexOf(intento.charAt(i)) != -1)
                regular++;
        }
        
        return intento + " Bien " + bien + " Regular " + regular;        
    }
}
