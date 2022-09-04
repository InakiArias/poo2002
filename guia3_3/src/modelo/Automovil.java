package modelo;

public abstract class Automovil {
    private static final double VEL_MAX_DEFAULT = 160;

    private String patente;
    private double velocidadmaxima;
    protected double velocidad;    
    private int marcha;

    public Automovil(String patente, double velocidadmaxima) {
        this.patente = patente;
        this.velocidadmaxima = velocidadmaxima;
    }

    public Automovil(String patente) {
        this(patente, VEL_MAX_DEFAULT);
    }

    public static double getVEL_MAX_DEFAULT() {
        return VEL_MAX_DEFAULT;
    }

    public String getPatente() {
        return patente;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public int getMarcha() {
        return marcha;
    }

    @Override
    public String toString() {
        return "Automovil{" + "patente=" + patente + ", velocidadmaxima=" + velocidadmaxima + ", velocidad=" + velocidad + ", marcha=" + marcha + '}';
    }  
    
    protected void setMarcha(int nuevaMarcha) {
        if (nuevaMarcha < 6 && nuevaMarcha > -2)
            this.marcha = nuevaMarcha;
    }
            
    public abstract void acelerar(double vel);
    public abstract void frenar(double vel);

    
    
}
