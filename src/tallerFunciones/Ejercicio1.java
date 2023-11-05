package tallerFunciones;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
        Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas
        extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
        de 40, el resto se consideran horas extras y que estas se pagan al doble de una hora
        normal cuando no exceden de 8; si las horas extras exceden de 8 se pagan las primeras
        8 al doble de lo que se pagan las horas normales y el resto al triple.
        El algoritmo debe imprimir, el valor pagado por horas normales, el valor pagado por
        horas al doble, el valor pagado por horas al triple y el valor total pagado.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        double tarifaHoraNormal = 10.0;  // Cambia esto por la tarifa por hora normal de tu empresa

        double[] resultado = calcularHorasExtras(horasTrabajadas, tarifaHoraNormal);
        double pagoNormal = resultado[0];
        double pagoDoble = resultado[1];
        double pagoTriple = resultado[2];
        double pagoTotal = resultado[3];

        System.out.printf("Valor pagado por horas normales: $%.2f%n", pagoNormal);
        System.out.printf("Valor pagado por horas al doble: $%.2f%n", pagoDoble);
        System.out.printf("Valor pagado por horas al triple: $%.2f%n", pagoTriple);
        System.out.printf("Valor total pagado: $%.2f%n", pagoTotal);

    }

    public static double[] calcularHorasExtras(double horasTrabajadas, double tarifaHoraNormal) {
        double tarifaHoraDoble = tarifaHoraNormal * 2;
        double tarifaHoraTriple = tarifaHoraNormal * 3;
        double horasNormales, horasDoble, horasTriple;

        if (horasTrabajadas <= 40) {
            horasNormales = horasTrabajadas;
            horasDoble = 0;
            horasTriple = 0;
        } else if (horasTrabajadas <= 48) {
            horasNormales = 40;
            horasDoble = horasTrabajadas - 40;
            horasTriple = 0;
        } else {
            horasNormales = 40;
            horasDoble = 8;
            horasTriple = horasTrabajadas - 48;
        }

        double pagoNormal = horasNormales * tarifaHoraNormal;
        double pagoDoble = horasDoble * tarifaHoraDoble;
        double pagoTriple = horasTriple * tarifaHoraTriple;
        double pagoTotal = pagoNormal + pagoDoble + pagoTriple;

        return new double[] { pagoNormal, pagoDoble, pagoTriple, pagoTotal };
    }



}
