package ejercicion4;

import java.util.Scanner;

/*Escribe un programa que escriba todos los divisores de un numero n entero positivo introducido
por el usuario.*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar un numero: ");
        int numero = scan.nextInt();

        int contador = 0;

        boolean a = true;

        while (a == true) {
            if (numero >= 1) {
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        System.out.println("* " + i);
                        contador++;
                    }
                }
                System.out.println("Hay un total de " + contador + " numeros divisores");
                a = false;
            } else {
                System.out.println("\n----------------------------");
                System.out.println("Ingresar un numero mayor a 0");
                System.out.println("----------------------------\n");

                System.out.print("Ingresar otro numero: ");
                numero = scan.nextInt();
            }
        }
    }
}
