package ejercicion6;

import java.util.ArrayList;
import java.util.Scanner;

/*Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos
entre dos enteros positivos leídos por teclado.*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar 2 numeros.");
        for (int i = 1; i < 3; i++) {
            System.out.println("Numero Nº" + i + ": ");
            numeros.add(scan.nextInt());
        }
        int num1 = numeros.get(0);
        
    }
}
