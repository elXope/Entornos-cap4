package capitulo4;

/**
 * Clase que genera un vector de enteros des del 1 hasta el número especificado por el usuario.
 * @author Josep Rubert
 * @version 1.0
 */
public class VectorEnteros {

    private int dim;
    private int[] vector;

    /**
     * Constructor de la clase VectorEnteros.
     * También crea el vector con los números del 1 al valor dim.
     * @param dim Número hasta el que llegará el vector.
     */
    public VectorEnteros(int dim) {
        this.dim = dim;
        this.rellenaVector();
    }

    /**
     * Setter para el parámetro dim.
     * También crea el vector con los números del 1 al valor dim.
     * @param dim  Número hasta el que llegará el vector.
     */
    public void setDim(int dim) {
        this.dim = dim;
        this.rellenaVector();
    }

    /**
     * @return Devuelve un vector de 1 hasta el valor del parámetro "dim".
     */
    public int[] getVector() {
        return this.vector;
    }

    private void rellenaVector() {
        this.vector = new int[this.dim];
        for (int i = 0; i < this.dim; i++) {
            this.vector[i] = i + 1;
        }
    }

    /**
     * Método estático que imprime un vector por filas de 10.
     * @param vector Vector parar imprimir.
     */
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i%10 == 0) System.out.println();
            System.out.print(vector[i] + "\t");
        }
    }
}
