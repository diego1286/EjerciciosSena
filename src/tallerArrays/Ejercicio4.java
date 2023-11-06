package tallerArrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int numFilas = scanner.nextInt();

        char[][] matrizIrregular = new char[numFilas][];

        for (int i = 0; i < numFilas; i++) {
            System.out.print("Ingrese la cantidad de letras para la fila " + (i + 1) + ": ");
            int numLetras = scanner.nextInt();

            matrizIrregular[i] = new char[numLetras];

            for (int j = 0; j < numLetras; j++) {
                System.out.print("Ingrese una letra para la fila " + (i + 1) + ", posicion " + (j + 1) + ": ");
                matrizIrregular[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.println("Datos de la matriz irregular:");
        for (int i = 0; i < numFilas; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print(matrizIrregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
