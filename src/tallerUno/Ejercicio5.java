package tallerUno;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Calcular el área de un círculo con el radio ingresado por el usuario.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        float radio= sc.nextFloat();

        float area = (float) (3.14 * Math.pow(radio, 2));
        System.out.println("El area del circulo es :" + area);
    }
}
