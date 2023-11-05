package tallerUno;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Determinar si un número ingresado por el usuario es positivo, negativo o cero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = sc.nextInt();
        if(num ==0){
            System.out.println("El numero es cero" + " " + num);
        } else if (num >0) {
            System.out.println("El numero es positivo" +  " " +num);
        }else {
            System.out.println("El numero es negativo" + " "+ num);
        }
    }
}
