package tallerFunciones;

/*
En una tienda de descuento se efectúa una promoción en la cual se hace un descuento
sobre el valor de la compra total según el color de la bolita que el cliente saque al
pagar en caja. Si la bolita es de color blanco no se le hará descuento alguno, si es verde
se le hará un 10% de descuento, si es amarilla un 25%, si es azul un 50% y si es roja un
100%. Determinar la cantidad final que el cliente deberá pagar por su compra. Se sabe
que solo hay bolitas de los colores mencionados.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Existen cuatro opciones de bolitas depende de esta su descuento Verde, Amarilla, Azul, Roja");

        int opcion;
        String colorBolita;

        do {
            System.out.print("Seleccione un numero para elegir el color de la bolita: ");
            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no valida. Por favor, seleccione un numero del 1 al 4.");
            }
        } while (opcion < 1 || opcion > 4);

        colorBolita = obtenerColorBolitaAleatorio(opcion);

        System.out.print("Ingrese el valor de la compra total: $");
        double valorCompra = scanner.nextDouble();

        double descuento = calcularDescuento(colorBolita, valorCompra);
        double precioFinal = valorCompra - descuento;

        System.out.printf("Color de la bolita: %s%n", colorBolita);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento);
        System.out.printf("Precio final a pagar: $%.2f%n", precioFinal);
    }

    public static String obtenerColorBolitaAleatorio(int opcion) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(4);  // Generar un número aleatorio entre 0 y 3

        switch (numeroAleatorio) {
            case 0:
                return "verde";
            case 1:
                return "amarilla";
            case 2:
                return "azul";
            case 3:
                return "roja";
            default:
                return "blanco";
        }
    }

    public static double calcularDescuento(String colorBolita, double valorCompra) {
        double descuento = 0.0;

        switch (colorBolita.toLowerCase()) {
            case "verde":
                descuento = valorCompra * 0.10;
                break;
            case "amarilla":
                descuento = valorCompra * 0.25;
                break;
            case "azul":
                descuento = valorCompra * 0.50;
                break;
            case "roja":
                descuento = valorCompra;
                break;
            default:
                break;
        }

        return descuento;
    }
}
