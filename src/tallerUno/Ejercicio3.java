package tallerUno;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Calcular el promedio de tres números ingresados por el usuario.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dato equivalente a un numero");
        float num1= scanner.nextFloat();
        System.out.println("Ingrese el dato equivalente a un numero");
        float num2= scanner.nextFloat();
        System.out.println("Ingrese el dato equivalente a un numero");
        float num3= scanner.nextFloat();

        float promedio = ((num1 + num2 + num3)/3);

        System.out.println("El promedio de los datos ingresados es  " + " " + promedio);

    }
}
