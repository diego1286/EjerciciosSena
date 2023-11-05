package tallerUno;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Calcular el área de un triángulo con base y altura ingresadas por el usuario.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la base del triangulo");

        float base = scanner.nextFloat();
        System.out.println("Ingresaste como base el valor de: = " + base);

        float altura = scanner.nextFloat();
        System.out.println("Ingresaste como altura el valor de: = " + altura);

        float area = (base * altura)/2;

        System.out.println("El area  del triangulo que ingresaste es de= " + area);


    }
}

