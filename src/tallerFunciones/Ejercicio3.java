package tallerFunciones;

/*
En una fábrica de computadoras se planea ofrecer a los clientes un descuento que
dependerá del número de computadoras que compre. Si las computadoras son menos
de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de
computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de
descuento; y si son 10 o más se les da un 40% de descuento.
El precio de cada computadora es de $1000000. Obtener la cantidad de dinero que una
persona recibe de descuento y la que tiene que pagar por el total de la compra.

 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de computadoras que va a comprar: ");
        int cantidadComputadoras = scanner.nextInt();

        double precioPorComputadora = 1000000.0;
        double descuento = calcularDescuento(cantidadComputadoras, precioPorComputadora);
        double totalCompra = calcularTotalCompra(cantidadComputadoras, precioPorComputadora);

        System.out.printf("Descuento aplicado: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", totalCompra);
    }

    public static double calcularDescuento(int cantidadComputadoras, double precioPorComputadora) {
        double descuento = 0.0;

        if (cantidadComputadoras < 5) {
            descuento = cantidadComputadoras * precioPorComputadora * 0.10;
        } else if (cantidadComputadoras < 10) {
            descuento = cantidadComputadoras * precioPorComputadora * 0.20;
        } else {
            descuento = cantidadComputadoras * precioPorComputadora * 0.40;
        }

        return descuento;
    }

    public static double calcularTotalCompra(int cantidadComputadoras, double precioPorComputadora) {
        double totalCompra = cantidadComputadoras * precioPorComputadora;
        return totalCompra;
    }
}
