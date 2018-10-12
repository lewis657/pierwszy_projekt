package pl.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 */
public class C02Z01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe calkowita:");
        byte age = scanner.nextByte();

        double doubleage = age;
        System.out.println("Liczba zmiennoprzecinkowa: " +doubleage);

    }
}
