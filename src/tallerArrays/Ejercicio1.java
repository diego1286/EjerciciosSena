package tallerArrays;

/*
En un supermercado un cajero captura los precios de los n
 artículos que un cliente compran e indica a cada cliente cual es el
 monto de lo que deben pagar. Realice programa que almacene los n valores,
 los muestre y al  fanal indicar cuanto fue lo que cobro a un clientes que paso por la caja.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de articulos que desea comprar ");
        int precios = sc.nextInt();

        int vector_precios[]=new int [precios];

        //se piden los valores de cada elemento para conocer el precio de los articulos
        for (int i = 0; i < precios ; i++) {
            System.out.println("Ingrese el valor de cada articulo");
            vector_precios[i] = sc.nextInt();
        }

        // se muestra en pantalla los valores de cada articulo
        for (int i = 0; i < precios; i++) {
            System.out.println("valor de un solo articulo" + " " +vector_precios[i]);
        }

        // se suma los valores del vector
        int total_pago=0;
        for(int valor:vector_precios){
            total_pago += valor;
        }
        System.out.println("El valor de tu cuenta es  " + total_pago);

    }


}
