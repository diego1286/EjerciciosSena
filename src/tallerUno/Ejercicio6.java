package tallerUno;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Calcular el área de un rectángulo con la longitud y ancho ingresados por el usuario.

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa la longuitud del rectangulo");
        float longuitud = sc.nextFloat();


        System.out.println("Ingresa el ancho del rectangulo");
        float ancho = sc.nextFloat();

        float area = (ancho*longuitud);
        System.out.println("El area del rectangulo es:" + " "+ area);

    }
}
