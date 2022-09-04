package modelo;

public class MaquinaExpendedoraTipo3 extends MaquinaExpendedora {
    
    public MaquinaExpendedoraTipo3(String nombre, double cantYerba) {
        super(nombre);
        creaDepositos(cantYerba);
    }
    
    public MaquinaExpendedoraTipo3(String nombre) {
        super(nombre);
        creaDepositos(TablaCapacidades.getCapMax("Yerba"));
    }
    
    private void creaDepositos(double cantYerba) {
        creaDeposito(new Ingrediente("Yerba"), cantYerba);
    }
    
}
