package pl.infoshare;

/**
 * 3 cw drugi program
 */
public class C03Z02 {
    public static void main(String[] args) {


// wersja by lewis
        /*
        int [][] arr20 = new int [10][10];
        for (int p=1 ; p <arr20.length +1 ; p++)
        {
           System.out.print(p + ". ");
            for (int j =1 ; j<arr20.length +1 ; j++)
            {

                if (p %2 == 0) System.out.print("*");
                if (p %2 != 0) System.out.print(" ");
            }
            System.out.println();
        }
*/
// wersja by jaro

        char [][] arr202 = new char [10][10];
        for (int p=1 ; p <arr202.length ; p++)
        {
            //arr20[p] = "*";
            System.out.print(p + ". ");
            for (int j =1 ; j<arr202.length ; j++)
            {
                arr202[p][j] = '*';
                if (p %2 == 0) System.out.print(arr202[p][j]);
                if (p %2 != 0) System.out.print(" ");
            }
            System.out.println();
        }




    }
}
