package capitulo4;

public class VectorEnteros {

    private int dim;
    private int[] vector;

    public VectorEnteros(int dim) {
        this.dim = dim;
        this.rellenaVector();
    }

    public void setDim(int dim) {
        this.dim = dim;
        this.rellenaVector();
    }

    public int[] getVector() {
        return vector;
    }

    private void rellenaVector() {
        this.vector = new int[this.dim];
        for (int i = 0; i < this.dim; i++) {
            this.vector[i] = i + 1;
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i%10 == 0) System.out.println();
            System.out.print(vector[i] + "\t");
        }
    }
}
