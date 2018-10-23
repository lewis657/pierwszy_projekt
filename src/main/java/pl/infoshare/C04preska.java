package pl.infoshare;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * preska z04
 */
public class C04preska {
    public static void main(String[] args)   throws IOException
    {


//boolean isfile =file.isFile();
   //     System.out.println(isfile);
    //    Scanner scannerWithFile = new Scanner(file);
        // Continue as long as it has a next line
//        do {
//            // Replace strings
//
//            String thisLine = scannerWithFile.nextLine();
//
//            // Only print the line out if not empty
//            if (!thisLine.isEmpty()) {
//                // Replace all spaces
//                thisLine = thisLine.replaceAll(" ", "");
//
//                // Print
//                System.out.println(thisLine);
//            }
//        } while (scannerWithFile.hasNext());

    // File.create(Paths.get("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/tablice.txt"));
       /*
        PrintWriter writer = new PrintWriter("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo2.txt");

        String [] tablice  = {"Jarek", "Darek" , "Kuba"};

        for(int i=0; i<tablice.length; i++)
        {
           // writer.print(tablice);
            writer.println(tablice[i]);
        }

        //writer.print(tablice);
        writer.close();
        */


       // File file = new File("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/plik.txt");
      //  boolean isfile =file.isFile();
      //       System.out.println(isfile);
       // File file = new File("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/plik.txt");

        /*** 2 zadanie
        PrintWriter writer = new PrintWriter("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo2.txt");
        Scanner theNumbers = new Scanner(System.in);
        //ArrayList user = new ArrayList();
        String joo;
        System.out.println("Podaj imie");

                joo = theNumbers.nextLine();

       // user.add(joo);

        writer.println(joo);
        writer.close();


       // System.out.println(joo);
*/
        int i;
        int[] array = new int[100];
        int[] ar= new int[100];
        Random random = new Random();
        PrintWriter writer = new PrintWriter("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo.txt");
        PrintWriter wr = new PrintWriter("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo2.txt");
        int randomint = random.nextInt(100) +1;
        System.out.println(randomint);
        for (i =0; i< array.length ; i++)
        {
            array[i] = random.nextInt(100) +1;
            writer.println(array[i]);
            if (i == 99)
            {
                for (i =0; i< ar.length ; i++) {
                    ar[i] = random.nextInt(100) + 1;

                    wr.println(ar[i]);

                }
            }
        }
        writer.close();
        wr.close();
        File file = new File("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo.txt");
        Scanner scannerWithFile = new Scanner(file);
        ArrayList user = new ArrayList();

        do {

            String thisLine = scannerWithFile.nextLine();

            user.add(thisLine);
        } while (scannerWithFile.hasNext());
        System.out.println("Pierwszy plik");
        System.out.println(user);
        File file2 = new File("C:/Users/Lewi's/pierwszy_projekt/src/main/java/pl/infoshare/joo2.txt");
        Scanner scannerWithFile2 = new Scanner(file2);
        ArrayList user2 = new ArrayList();

        do {

            String thisLine = scannerWithFile2.nextLine();

            user2.add(thisLine);
        } while (scannerWithFile2.hasNext());
        System.out.println("Drugi plik");
        System.out.println(user2);

        int counter =0;

      //  boolean check = user.contains(user2);
        boolean result = Arrays.equals(user.toArray(),user2.toArray());
        System.out.println(result);
        if (result) {
            counter++;
        }




        System.out.println("Liczba powtórzonych cyfr to " + counter);
    }
}

