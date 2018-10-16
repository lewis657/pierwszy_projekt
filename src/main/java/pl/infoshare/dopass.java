package pl.infoshare;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
/**
 * Trzeci Proogram z zajęć drugich
 */
public class C02Z03B {
    public static void main(String[] args) {
        /*
        Nie mimo importu consoli nie odpala mi ;(


        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }
        //Object obj = null;
        //obj.toString();
        Console console = System.console();
        System.out.print("Enter your password: ");
        char[] password = console.readPassword();
        */

       // Console console = System.console();
        //System.out.print("Enter your password: ");
        //char[] password = console.readPassword();


        try {

            MaskFormatter f = new MaskFormatter("### ###-####");

            // Tell it to use literals as well in the mask (the hyphen in our case)

            f.setValueContainsLiteralCharacters(false);

            System.out.println(f.valueToString("1234567890"));

        }

        catch (ParseException p) { System.out.println(p.toString()); }

    }

}
