package tallerUno;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Calcular el salario semanal de un empleado, dado su salario por hora y las horas trabajadas en una semana.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Ingrese las horas trabajadas en una semana: ");
        double horasTrabajadas = scanner.nextDouble();

        // Calcular el salario semanal
        double salarioSemanal = salarioPorHora * horasTrabajadas;

        System.out.println("El salario semanal del empleado es: $" + salarioSemanal);
    }
}
