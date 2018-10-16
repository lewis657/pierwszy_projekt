package pl.infoshare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Trzeci Proogram z zajęć drugich
 */
public class C03Z03 {
    public static void main(String[] args) {


// wersja by lewis
        Integer array[] = new Integer[0];
        ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(array));
        Scanner scanner = new Scanner(System.in);
        int i = 0 ;
        Byte counter = 0;
        Integer value ;
        // zmieniłem na 3 ;)
        while (counter <= 2)
        {
            counter ++;
            System.out.print( counter +  ". Podaj Liczbę: ");
            value = scanner.nextInt();
            while (value > 10) {
                System.out.print("Liczba za duża musi być mniejsza od 10: ");
                value = scanner.nextInt();

            }
          // coś zamonciłem for ( i = 0; i < array.length; i++)
                List.add(value);
                array = List.toArray(array);
        }
        System.out.print("Liczby które podałeś znajdują się w tablicy:");
        System.out.print(Arrays.toString(array));

    }
}
