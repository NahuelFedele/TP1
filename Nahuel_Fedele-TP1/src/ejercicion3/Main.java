package ejercicion3;

import java.util.Scanner;

/*Escribe un programa que calcule el factorial de n donde n es un numero entero mayor o igual
que cero dado por el usuario.*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar un numero: ");
        int numero = scan.nextInt();

        int fact = 1;
        boolean a = true;
        while (a == true) {
            if (numero >= 1) {
                for (int i = 2; i <= numero; i++) {
                    fact = fact * i;
                }
                a = false;
            } else {
                System.out.println("\n----------------------------");
                System.out.println("Ingresar un numero mayor a 0");
                System.out.println("----------------------------\n");

                System.out.print("Ingresar otro numero: ");
                numero = scan.nextInt();
            }
        }
        System.out.println("El factorial del número " + numero + " es " + fact);
    }
}
