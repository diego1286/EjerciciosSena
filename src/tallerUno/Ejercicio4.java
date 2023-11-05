package tallerUno;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Determinar si un número ingresado por el usuario es par o impar.

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int number = sc.nextInt();
        if(number % 2 ==0 ){
            System.out.println("El numero que ingresaste es par = " + " " + number);
        }else{
            System.out.println("El numero que ingresaste no es par" + " " + number);
        }
    }
}
