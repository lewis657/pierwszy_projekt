package pl.infoshare;

import java.util.Scanner;

/**
 * Pierwszy program
 */
public class C02Z01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe calkowita:");
        int age = 0;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            double doubleage = age;
            System.out.println("Liczba zmiennoprzecinkowa: " +doubleage);
        } else {
            System.out.println("Następnym razem podaj liczbe całkowitą!");
        }



    }
}
