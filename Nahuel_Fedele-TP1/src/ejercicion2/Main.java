package ejercicion2;

import java.util.Scanner;

/*Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no.
Recuerda que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100
y no lo son de 400. Es decir, el año 2000 si es bisiesto, pero no lo son el 1990 ni el 2100.*/
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean i = true;

        System.out.print("Escribi un año: ");
        int anio = scan.nextInt();
        while (i == true) {
            if (anio >= 1900 && anio <= 2500) {
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    System.out.println("El año es bisiesto.");
                    i = false;
                } else {
                    System.out.println("El año no es bisiesto.");
                    i = false;
                }
            } else {
                System.out.println("\n----------------------------------------");
                System.out.println("El año tiene que ser entre (1900 - 2500)");
                System.out.println("----------------------------------------\n");
                System.out.print("Escribi otro año: ");
                anio = scan.nextInt();
            }
        }
    }
}
