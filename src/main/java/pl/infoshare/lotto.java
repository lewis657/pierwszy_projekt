package pl.infoshare;
import java.util.*;


/**
 * Lotto v2
 */
public class lotto {
    public static void main(String[] args) {

        Scanner theNumbers = new Scanner(System.in);
        ArrayList userNumber = new ArrayList();
        int counter = 0;
        int i;
        int guesses;

        ArrayList numb = new ArrayList();
        ArrayList winningNumbers = new ArrayList();
        for( i = 0; i <= 48; i++)
        {
            numb.add(i+1);
        }
        Collections.shuffle(numb);

        for(int j =0; j < 6; j++)
        {
            winningNumbers.add(numb.get(j));
          //  System.out.print(numb.get(j) + " ");
        }
      //  System.out.println(winningNumbers);


        System.out.println("Podaj 6 cyfr z zakresu od 0 do 49:");
        for (i = 0; i < 6; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            guesses = theNumbers.nextInt();
            if (guesses > 49 || guesses < 0) {
                System.out.println("Podaj cyfrę z zakresu!");
                i--;
            }

            if(userNumber.contains(guesses)){
                System.out.println("Nie duplikuj liczb");
                i--;

                counter--;
            }
            else {
                userNumber.add(guesses);
            }


            boolean check = winningNumbers.contains(guesses);
            if (check) {
                counter++;
            }

        }


        System.out.println("Trafiłeś : " + counter + " liczb!");
        System.out.print("Zwycięskie liczby to: ");
        System.out.println(winningNumbers);

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

