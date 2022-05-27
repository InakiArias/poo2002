package modelo;

public class MaquinaExpendedoraTipo1 extends MaquinaExpendedora {
    
    public MaquinaExpendedoraTipo1(String nombre, double cantCafe, double cantTe, double cantLeche, double cantCacao) {
        super(nombre);
        creaDepositos(cantCafe, cantTe, cantLeche, cantCacao);
    }
    
    public MaquinaExpendedoraTipo1(String nombre) {
        super(nombre);
        creaDepositos(TablaCapacidades.getCapMax("Café"),
                TablaCapacidades.getCapMax("Té"), 
                TablaCapacidades.getCapMax("Leche"), 
                TablaCapacidades.getCapMax("Cacao"));
    }
    
    private void creaDepositos(double cantCafe, double cantTe, double cantLeche, double cantCacao) {
        creaDeposito(new Ingrediente("Café"), cantCafe);
        creaDeposito(new Ingrediente("Té"), cantTe);
        creaDeposito(new Ingrediente("Leche"), cantLeche);
        creaDeposito(new Ingrediente("Cacao"), cantCacao);
    }
    
}
