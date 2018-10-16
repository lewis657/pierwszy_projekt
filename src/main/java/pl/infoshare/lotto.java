package pl.infoshare;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Lotto
 */
public class lotto {
    public static void main(String[] args) {
        int[] numbers = new int[49];
        int[] winningNumbers = new int[6];
        int[] userNumber = new int[6];
        Scanner theNumbers = new Scanner(System.in);
        int guesses;
        int counter = 0;
        int i;

        //random
        for (i = 0; i < winningNumbers.length; i++) {
            int randomNums = new Random().nextInt(49) + 1;
            winningNumbers[i] = randomNums;
            boolean b = Arrays.asList(winningNumbers).contains(randomNums);
            // System.out.println(b);
            if (b == true) {
                i--;
            }
        }

        //  System.out.print(Arrays.toString(winningNumbers));
        System.out.println("Podaj 6 cyfr z zakresu od 0 do 49:");
        for (i = 0; i < userNumber.length; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            guesses = theNumbers.nextInt();
            if (guesses > 49 || guesses < 0) {
                System.out.println("Podaj cyfrę z zakresu!");
                i--;
            }

            userNumber[i] = guesses;
            //  System.out.println(userNumber[i]);
            if (winningNumbers[i] == userNumber[i]) {
                counter += 1;
            }
        }
        //System.out.println(winningNumbers);
        System.out.println("Trafiłeś : " + counter + " liczb!");
        System.out.print("Zwycięskie liczby to: ");
        System.out.println(Arrays.toString(winningNumbers));

        switch (counter)
        {
            case 6:
                {
                    System.out.println("Gratulacje trafiłeś szóstkę ! ;)");
                break;
                }
                case 5:
                {
                    System.out.println("Gratulacje trafiłeś 5 ! ;)");
                    break;
                }
                case 4:
                {
                    System.out.println("Gratulacje trafiłeś 4 ! ;)");
                    break;
                }
                case 3:
                {
                    System.out.println("Gratulacje trafiłeś 3 ! ;)");
                    break;
                }
                default:{
                    System.out.println("Niestety kasy nie będzie ;(");
                }
        }
    }
}

