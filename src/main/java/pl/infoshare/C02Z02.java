package pl.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 */
public class C02Z02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj wiek:");
        byte age = scanner.nextByte();
        if (age > 123 || age <= 0) {
            System.exit(1);
        }
        if (age >= 18)
        {
            System.out.println("Jesteś pełnoletni! \n Twój wiek to: " +age);
        }
        else
        {
            System.out.println("Nie jesteś pełnoletni! \n Twój wiek to: "+age);
        }

    }
}
