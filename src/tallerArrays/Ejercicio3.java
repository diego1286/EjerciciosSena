package tallerArrays;
/*
Realice un algoritmo que permita ingresar las dimensiones de una matriz (Ingresar # de filas y columnas) e
ingresar números enteros en toda las celdas de la matriz.
El programa debe validar que las dimensiones ingresadas permitan definir una matriz cuadrada,
 (número de fila igual al número de columnas) de lo contrario muestra un mensaje “Matriz no es cuadrada”.
El algoritmo debe mostrar:
1. Todos los valores de la matriz
2. La sumatoria de los valores que están en la diagonal principal de la matriz.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        if (filas != columnas) {
            System.out.println("Matriz no es cuadrada");
            return; // Salir del programa si la matriz no es cuadrada
        }

        int[][] matriz = new int[filas][columnas];

        // Ingresar números enteros en la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor en la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar todos los valores de la matriz
        System.out.println("Valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular la sumatoria de la diagonal principal
        int sumatoriaDiagonal = 0;
        for (int i = 0; i < filas; i++) {
            sumatoriaDiagonal += matriz[i][i];
        }

        System.out.println("Sumatoria de los valores en la diagonal principal: " + sumatoriaDiagonal);
    }
}
