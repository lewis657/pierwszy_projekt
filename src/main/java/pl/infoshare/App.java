package pl.infoshare;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        char wiek = 'a';
        switch (wiek) {
            case 'a': {
                System.out.println("joo");

                break;
            }
            default: {
                System.out.println("nie");

            }
        }
short age= 11;
        System.out.println("siema :"+ (age >12 ? "tak" : "nie") );

        //wczytwanie danych z klawaitury

       /* Sanner scanner = new Scanner(System.in);
        System.out.print("daj wiek:");
        String agefk = scanner.nextLine();
        System.out.println("podaes " +agefk);
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe calkowita:");
        byte aga = scanner.nextByte();
       // if (age != byte)
    //    {
      //      System.out.println("zla warosc liczby");
      //  }
        double agaa = aga;
        System.out.println("Liczba zmiennoprzecinkowa " +agaa);

    }
}
