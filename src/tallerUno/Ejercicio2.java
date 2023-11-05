package tallerUno;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Convertir grados Celsius a grados Fahrenheit usando la fórmula (°F = °C * 9/5 + 32).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad  de grados Celsius que deseas convertir: ");
        
        float celsius = scanner.nextFloat();


        float fahrenheit = ((celsius * (9/5)) +32);
        System.out.println("La cantidad de grados fahrenheit que hay son  :" + " " + fahrenheit);

    }
}
