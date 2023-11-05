package tallerUno;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Calcular el costo total de comprar una cantidad específica de un artículo a un precio unitario dado.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el producto que deseas comprar");
        String producto = sc.nextLine();
        System.out.println("producto = " + producto);
        System.out.println("Digite la cantidad que deseas comprar");
        int cantidad = sc.nextInt();
        System.out.println("Digite el valor que tiene el producto");
        int valor_producto = sc.nextInt();

        int total_producto = (valor_producto * cantidad);

        System.out.println("El precio total del producto es : = " + " "  +total_producto);





    }
}
