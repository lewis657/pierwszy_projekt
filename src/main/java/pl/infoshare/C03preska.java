package pl.infoshare;

import java.util.Random;

/**
 * Trzeci Proogram z zajęć drugich
 */
public class C03preska {
    public static void main(String[] args) {


      //  int[] array = new int[11];

       // System.out.println( "Indeksy nieparzyste" + array[0] + " " + array[2] + " " + array[4]);

/*
        //int i = 0;
        int i =0;
        while (i <=11)
        {

            i++;
            array [i] = i;
            System.out.println(array[i]);
        }*/

// zadnie pierwsze
        int[] array = new int[11];
        Random random = new Random();
        int randomint = random.nextInt(100) +1;
        System.out.println(randomint);
        for (int i =0; i< array.length ; i++)
        {
            array[i] = random.nextInt(100) +1;
        }
        for (int i =0; i< array.length ; i++)
        {
            if (i %2 != 0) System.out.println(i + ". "+array[i]);
        }




        int [] arrayfor = new int [1000];
        for (int d=0; d<1000 ; d++)
        {
            arrayfor [d] = d + 1;

        }
        for (int elemnt :arrayfor)
        {
            System.out.println(elemnt);
        }


/*
        for (int p=0 ; p <arr20.length ; p++)
        {
            System.out.println(" wiersz" +p);
            for (int j =0 ; j<arr20.length ; j++)
            {
                System.out.println("kolumna " +j);
            }
        }

        */
        int [][] arr20 = new int [10][10];
        for (int p=1 ; p <arr20.length +1 ; p++)
        {
            System.out.print(p + ". ");
            for (int j =1 ; j<arr20.length +1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
