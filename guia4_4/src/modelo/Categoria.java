package modelo;

public class Categoria {
    protected String nombre;
    protected double sueldo;
    protected boolean habilitaColectivoLinea;
    protected boolean habilitaColectivoLarga;
    protected boolean habilitaCamion;

    public Categoria(String nombre, double sueldo, boolean habilitaColectivoLinea, boolean habilitaColectivoLarga, boolean habilitaCamion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.habilitaColectivoLinea = habilitaColectivoLinea;
        this.habilitaColectivoLarga = habilitaColectivoLarga;
        this.habilitaCamion = habilitaCamion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public boolean habilitaColectivoLinea() {
        return habilitaColectivoLinea;
    }

    public boolean habilitaColectivoLarga() {
        return habilitaColectivoLarga;
    }

    public boolean habilitaCamion() {
        return habilitaCamion;
    }
    
    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    protected void setHabilitaColectivoLinea(boolean habilitaColectivoLinea) {
        this.habilitaColectivoLinea = habilitaColectivoLinea;
    }

    protected void setHabilitaColectivoLarga(boolean habilitaColectivoLarga) {
        this.habilitaColectivoLarga = habilitaColectivoLarga;
    }

    protected void setHabilitaCamion(boolean habilitaCamion) {
        this.habilitaCamion = habilitaCamion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    
}
