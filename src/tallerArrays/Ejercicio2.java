package tallerArrays;

/*Realice algoritmo que permita registrar el sexo de los n estudiantes
que ingresan al salón y muestre cuantos son hombre y cuantos son mujeres,
adicionalmente debe mostrar el orden de ingreso de género.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> genero = new ArrayList<>();

        boolean success = true;
        while (success) {
            System.out.println(" Ingrese el genero femenino o masculino de la persona  o la letra O para finalizar");
           String tipo_gender = sc.nextLine();
           if(tipo_gender.equals("o")){
               success = false;;
           }else{
               genero.add(tipo_gender);
           }
        }

        System.out.println("Los generos existentes son:");
        for (int i = 0; i < genero.size(); i++) {
            System.out.println( genero.get(i));
        }

        int mujeres = 0;
        int hombres = 0;

        for (String persona : genero) {
            if (persona.equals("femenino")) {
                mujeres++;
            } else if (persona.equals("masculino")) {
                hombres++;
            }
        }

        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Cantidad de hombres: " + hombres);

    }
}
