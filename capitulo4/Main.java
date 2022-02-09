package capitulo4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato = teclado.nextInt();
        int[] vector = new int[dato];
        System.out.println("\nVector inicial hasta :" + dato);
        llenarVector(vector);
        imprimirVector(vector);
        vector = generarPrimos(dato);
        System.out.println("\nVector de primos hasta:" + dato);
        imprimirVector(vector);
    }

    private static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
    }

    private static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i%10 == 0) System.out.println();
            System.out.print(vector[i] + "\t");
        }
    }

    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max) {
        if (max >= 2) {
            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = inicializaVectorBoolean(dim); // Array con todos las posiciones a partir de la 2 true
            esPrimo = encuentraPrimos(esPrimo); // Funcion que deja solo los primos como true
            int[] primos = new int[cuentaPrimos(esPrimo)];
            primos = llenaVectorPrimos(esPrimo, primos);
            return primos;
        } else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    private static boolean[] inicializaVectorBoolean(int dim) {
        boolean[] vector = new boolean[dim];
        for (int i = 2; i < dim; i++) {
            vector[i] = true;
        }
        return vector;
    }

    private static boolean[] encuentraPrimos(boolean[] esPrimo) {
        for (int i = 2; i <= Math.sqrt(esPrimo.length); i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2 * i; j < esPrimo.length; j += i)
                    esPrimo[j] = false;
            }
        }
        return esPrimo;
    }

    private static int cuentaPrimos(boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 2; i < esPrimo.length; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static int[] llenaVectorPrimos(boolean[] esPrimo, int[] primos) {
        int j = 0;
        for (int i = 0; i < esPrimo.length; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }
}