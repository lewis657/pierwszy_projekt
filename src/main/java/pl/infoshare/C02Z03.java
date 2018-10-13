package pl.infoshare;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Trzeci Proogram z zajęć drugich
 */
public class C02Z03 {
    public static void main(String[] args) {
        /*
        Nie mimo importu consoli nie odpala mi ;(
        Console console = System.console();
        String username = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");

*/

        String[]  Password =  {"123","321"};
        String[] Username =  {"user", "admin"};

        Scanner input1 = new Scanner(System.in);
        System.out.print("Nazwa użytkownika : ");
        String user = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Hasło : ");
        String pass = input2.next();

        //if (username.equals(Username) && password.equals(Password)) {

        if (Arrays.asList(Username).contains(user) && Arrays.asList(Password).contains(pass))
        {
            System.out.println("Dostęp uzyskany! \nWitaj: " + user);
        }
        else if (user.equals(Username)) {
            System.out.println("Złe hasło!");
        } else if (pass.equals(Password)) {
            System.out.println("Błędny użytkownik!");
        } else {
            System.out.println("Nie ma takiego konta! \n Uwaga:Wielkość liter ma znaczenie!");
        }
    }
}
