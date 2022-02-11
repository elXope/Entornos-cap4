package capitulo4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int nMax = teclado.nextInt();

        VectorEnteros vector = new VectorEnteros(nMax);
        System.out.println("\nVector inicial hasta :" + nMax);
        VectorEnteros.imprimirVector(vector.getVector());

        CribaErastotenes criba = new CribaErastotenes(nMax);
        System.out.println("\nVector de primos hasta:" + nMax);
        VectorEnteros.imprimirVector(criba.vectorPrimos());
    }

}