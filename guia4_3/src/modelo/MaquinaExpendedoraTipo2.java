package modelo;

public class MaquinaExpendedoraTipo2 extends MaquinaExpendedora {
    
    public MaquinaExpendedoraTipo2(String nombre, double cantCafe, double cantTe, double cantCrema, double cantCacao) {
        super(nombre);
        creaDepositos(cantCafe, cantTe, cantCrema, cantCacao);
    }
    
    public MaquinaExpendedoraTipo2(String nombre) {
        super(nombre);
        creaDepositos(TablaCapacidades.getCapMax("Café"),
                TablaCapacidades.getCapMax("Té"), 
                TablaCapacidades.getCapMax("Crema"), 
                TablaCapacidades.getCapMax("Cacao"));
    }
    
    private void creaDepositos(double cantCafe, double cantTe, double cantCrema, double cantCacao) {
        creaDeposito(new Ingrediente("Café"), cantCafe);
        creaDeposito(new Ingrediente("Té"), cantTe);
        creaDeposito(new Ingrediente("Crema"), cantCrema);
        creaDeposito(new Ingrediente("Cacao"), cantCacao);
    }
    
}
