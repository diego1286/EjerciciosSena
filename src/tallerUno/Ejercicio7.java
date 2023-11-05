package tallerUno;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Calcular el volumen de una esfera con el radio ingresado por el usuario.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        float radio = sc.nextFloat();

        float volumen= (float) ( (4 * Math.pow(radio, 3))/3)  ;

        System.out.println("El volumen de la esfera es:" + " "+ volumen);



    }
}
