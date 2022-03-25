package ejercicion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Escribe un programa que tome 3 números enteros introducidos por el usuario mediante el
teclado y determine cuantos de dichos números son diferentes, el promedio, la suma de todos,
el producto del mayor por el menor y si el numero restante es divisible por 3.*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar 3 numeros.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar numero: ");
            numeros.add(sc.nextInt());
        }
        Collections.sort(numeros);

        int num1 = numeros.get(0);
        int num2 = numeros.get(1);
        int num3 = numeros.get(2);

        int a = 0;
        if (num1 == num2 && num1 == num3) {
            System.out.println("\nTodos los numeros son iguales");
        }
        if (num1 != num2) {
            a = a + 1;
        }

        if (num1 != num3) {
            a = a + 1;
        }

        if (num2 != num3) {
            a = a + 1;
        }

        if (a >= 1) {
            System.out.println("\nCantidad de numeros diferentes: " + a);
        }

        /*-------------------- SUMA ---------------------*/
        int suma = num1 + num2 + num3;
        System.out.println("\nSUMA de todos los numeros: " + suma);

        /*-------------------- PROMEDIO ---------------------*/
        double prom = Double.valueOf(suma) / 3;
        System.out.println("\nPROMEDIO de todos los numeros: " + prom);

        /*-------------------- PRODUCTO ---------------------*/
        int mult = num1 * num3;
        System.out.println("\nPRODUCTO del mayor por el menor: " + mult);

        /*-------------------- DIVISIBLE POR 3 ---------------------*/
        double num_rest = prom / 3;
        System.out.println("\nEl numero " + prom + " dividido tres: " + num_rest);
    }

}
