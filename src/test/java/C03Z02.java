import java.io.Console;
import java.util.Scanner;

public class C03Z02 {
    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

        System.out.print("Enter your username: ");
        String username = console.readLine();

        System.out.print("Enter your password: ");
        char[] password = console.readPassword();

        String passport = console.readLine("Enter your %d (th) passport number: ", 2);

        Scanner scanner = new Scanner(System.in);

    }
}
