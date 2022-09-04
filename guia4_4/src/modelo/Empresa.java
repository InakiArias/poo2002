package modelo;

import java.util.ArrayList;

public class Empresa {

    private final ArrayList<Categoria> categorias;
    private final ArrayList<Vehiculo> vehiculos;
    private final ArrayList<Chofer> choferes;
    private final ArrayList<Acoplado> acoplados;

    public Empresa() {
        this.categorias = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.choferes = new ArrayList<>();
        this.acoplados = new ArrayList<>();
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public void addChofer(Chofer chofer) {
        this.choferes.add(chofer);
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void addAcoplado(Acoplado acoplado) {
        this.acoplados.add(acoplado);
    }

    public Categoria getCategoria(int indice) {
        return categorias.get(indice);
    }

    public Chofer getChofer(int indice) {
        return choferes.get(indice);
    }

    public Vehiculo getVehiculo(int indice) {
        return vehiculos.get(indice);
    }

    public Acoplado getAcoplado(int indice) {
        return acoplados.get(indice);
    }

    public void asignarVehiculo(Vehiculo vehiculo, Chofer chofer) {
        if (vehiculo.aceptoChofer(chofer)) {
            chofer.setVehiculoAsignado(vehiculo);
        }
    }

    public void deasignarVehiculo(Vehiculo vehiculo, Chofer chofer) {
        chofer.setVehiculoAsignado(null);
    }
    
    public void asignarAcoplado(Acoplado acoplado, Camion camion) {
        if (!acoplado.enUso) {
            camion.acoplado = acoplado;
            acoplado.enUso = true;
        }
    }
    
    public void deasignarAcoplado(Acoplado acoplado, Camion camion) {
        if (camion.acoplado == acoplado) {
            camion.acoplado = null;
            acoplado.enUso = false;
        }
    }

    public int cantChoferesCategoria(Categoria categoria) {
        int res = 0;

        for (Chofer chofer : this.choferes) {
            if (chofer.getCategoria() == categoria) {
                res++;
            }
        }

        return res;
    }

    public int cantChoferesSinAsignar() {
        int res = 0;

        for (Chofer chofer : this.choferes) {
            if (chofer.getVehiculoAsignado() == null) {
                res++;
            }
        }

        return res;
    }

    public int cantVehiculos() {
        return this.vehiculos.size();
    }
    
    public int cantAcoplados() {
        return this.acoplados.size();
    }

    @Override
    public String toString() {
        return "Empresa{" + "\n categorias=" + categorias + "\n vehiculos=" + vehiculos + "\n choferes=" + choferes + "\n acoplados=" + acoplados + "\n}";
    }
    
    public static void iniciaCategorias(Empresa empresa) {
        empresa.categorias.add(new Categoria("Categoria 1", 10000, true, false, false));
        empresa.categorias.add(new Categoria("Categoria 2", 15000, true, true, false));
        empresa.categorias.add(new Categoria("Categoria 3", 15000, false, false, true));
        empresa.categorias.add(new Categoria("Categoria 4", 17000, true, true, true));
    }

}
