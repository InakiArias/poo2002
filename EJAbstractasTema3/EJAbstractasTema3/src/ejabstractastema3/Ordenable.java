package ejabstractastema3;

public abstract class Ordenable
{

    /**
     * Devuelve un int que es el resultado 
     * de la comparación con otro objeto
     *
     * @param b El objeto con el cual se va a comparar
     * @return Menor a 0 si el parámetro es mayor<br>
     * Mayor a 0 si el parámetro es menor<br>
     * Igual a 0 si son iguales.
     */
    public abstract int compare(Ordenable b);

    public static int p_menor(Ordenable[] b, int desde)
    {
        int menor = desde;
        for (int i = menor + 1; i < b.length; i++)
        {
            if (b[menor].compare(b[i]) > 0)
            {
                menor = i;
            }
        }
        return menor;
    }

    public static void intercambio(Ordenable[] b, int i, int j)
    {
        Ordenable aux = b[i];
        b[i] = b[j];
        b[j] = aux;
    }

    public static void ordenar_seleccion(Ordenable[] a)
    {
        a[0] = new Cualquiera();
        
        int menor;
        for (int i = 0; i < a.length - 1; i++)
        {
            menor = p_menor(a, i);
            if (menor != i)
            {
                intercambio(a, menor, i);
            }
        }
    }

}
