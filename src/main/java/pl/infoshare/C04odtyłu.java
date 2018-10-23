package pl.infoshare;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * preska z04
 */
public class C04odtyłu {
    public static void main(String[] args)   throws IOException
    {



        PrintWriter writer = new PrintWriter("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo2.txt");
        Scanner theNumbers = new Scanner(System.in);
        //ArrayList user = new ArrayList();
        String joo;
        ArrayList user = new ArrayList();
        System.out.println("Podaj tekst");

        joo = theNumbers.nextLine();
       user.add(joo);

        writer.println(user);

        writer.close();




    }
}

