package pl.infoshare;

import java.util.Scanner;

/**
 * Pierwszy program zadanie dodatkowe
 */
public class C02Z01B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe :");

        char character = scanner.next().charAt(0);
        System.out.println((int)character);
    }
}
