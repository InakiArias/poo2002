package modelo;

public abstract class Vehiculo {

    private static double PRECIO_BASE_DIA = 500;

    private String patente;
    private int diasAlquiler;

    public Vehiculo(String patente, int diasAlquiler) {
        this.patente = patente;
        this.diasAlquiler = diasAlquiler;
    }

    public String getPatente() {
        return patente;
    }

    public static double getPRECIO_BASE_DIA() {
        return PRECIO_BASE_DIA;
    }

    public static void setPRECIO_BASE_DIA(double PRECIO_BASE_DIA) {
        Vehiculo.PRECIO_BASE_DIA = PRECIO_BASE_DIA;
    }

    public abstract double calcularAlquiler();
  
    
}
