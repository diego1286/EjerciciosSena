package tallerFunciones;

/*
Se desea realizar un programa que permita calcular el Índice de Maza Corporal (IMC) de una
personas, la fórmula para calcular el IMC es la siguiente:

Además el programa debe determinar la condición de peso de cada persona, según su
IMC, es decir, si la persona tiene IMC menor a 18 está bajo de peso, si el IMC está entre 18
y 24 entonces esta normal de peso, si el IMC está entre 25 y 27 entonces la persona tiene
sobre peso, de lo contrario la persona esta obeso.
El programa debe:
1. Mostrar el IMC de cada una de las personas y mostrar su condición de peso según
su peso y estatura.
2. Mostrar el IMC sin decimales, tal como se muestra en la imagen anterior..

 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();

        double imc = calcularIMC(peso, estatura);
        String condicionPeso = determinarCondicionPeso(imc);

        System.out.println("Su IMC es: " + (int) imc); // Mostrar el IMC sin decimales
        System.out.println("Condición de peso: " + condicionPeso);
    }

    public static double calcularIMC(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

    public static String determinarCondicionPeso(double imc) {
        if (imc < 18) {
            return "Bajo de peso";
        } else if (imc >= 18 && imc <= 24) {
            return "Normal de peso";
        } else if (imc >= 25 && imc <= 27) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

}
