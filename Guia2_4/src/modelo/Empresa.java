package modelo;

import java.util.ArrayList;

public class Empresa {

    private static Empresa instance = null;

    private int ultimoNumeroColectivo = 0;

    private final ArrayList<Categoria> categorias;
    private final ArrayList<Colectivo> colectivos;
    private final ArrayList<Chofer> choferes;

    private Empresa() {
        this.categorias = new ArrayList<>();
        this.colectivos = new ArrayList<>();
        this.choferes = new ArrayList<>();
    }

    public static Empresa getInstance() {
        if (Empresa.instance == null) {
            Empresa.instance = new Empresa();
        }

        return Empresa.instance;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public ArrayList<Colectivo> getColectivos() {
        return colectivos;
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public int getUltimoNumeroColectivo() {
        return this.ultimoNumeroColectivo;
    }

    public void addColectivo(Colectivo colectivo) {
        this.ultimoNumeroColectivo++;
        colectivo.setNumero(this.ultimoNumeroColectivo);
        this.colectivos.add(colectivo);
    }

    public void addChofer(Chofer chofer) {
        this.choferes.add(chofer);
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public Categoria getCategoria(int indice) {
        return categorias.get(indice);
    }

    public Chofer getChofer(int indice) {
        return choferes.get(indice);
    }

    public Colectivo getColectivo(int indice) {
        return colectivos.get(indice);
    }

    public void asignar(Chofer chofer, Colectivo colectivo) {
        if (!colectivo.isAsignado() && chofer.getColectivoAsignado() == null) {
            chofer.setColectivoAsignado(colectivo);
            colectivo.setAsignado(true);
        }
    }

    public void desvincular(Chofer chofer, Colectivo colectivo) {
        if (chofer.getColectivoAsignado() == colectivo) {
            chofer.setColectivoAsignado(null);
            colectivo.setAsignado(false);
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
            if (chofer.getColectivoAsignado() == null) {
                res++;
            }
        }

        return res;
    }

    public int cantColectivos() {
        return this.colectivos.size();
    }

    public int cantCatSuperiores(double monto) {
        int res = 0;

        for (Categoria categoria : this.categorias) {
            if (categoria.getSueldo() > monto) {
                res++;
            }
        }

        return res;
    }

}
