package conjuntos;

public class OperacionInvalidaException extends RuntimeException {
    private String error;
    private Object elemento;

    public OperacionInvalidaException(String error, Object elemento, String message) {
        super(message);
        this.error = error;
        this.elemento = elemento;
    }

    public String getError() {
        return error;
    }

    public Object getElemento() {
        return elemento;
    }
    
    
    
    
}
