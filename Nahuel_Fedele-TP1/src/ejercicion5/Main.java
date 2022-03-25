package ejercicion5;

import java.util.Scanner;

/*Escribe un programa que escriba la tabla de multiplicar de cualquier numero entero dado por el
usuario entre 1 y 10.*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresar un numero entre 1 y 10: ");
        int num = scan.nextInt();

        boolean a = true;

        while (a == true) {
            if (num >= 1 && num <= 10) {
                int mult;
                for (int i = 1; i < 11; i++) {
                    mult = num * i;
                    System.out.println(num + " x " + i + " = " + mult);
                }
                a = false;
            } else {
                System.out.println("\n--------------------------------------");
                System.out.println("El numero tiene que estar entre 1 y 10");
                System.out.println("--------------------------------------\n");
                System.out.print("Ingresar un numero: ");
                num = scan.nextInt();
            }
        }
    }
}
