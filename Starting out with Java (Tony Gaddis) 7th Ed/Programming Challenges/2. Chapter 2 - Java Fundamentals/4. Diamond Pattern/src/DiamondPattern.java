/*
* Book: Starting Out with Java, 7th Edition by Tony Gaddis
* Program Author: Kyle Martin | https://github.com/thesnowmanndev
* This program was created to display a Star Pattern.
* */
public class DiamondPattern {
    public static void main(String[] args) {
        int row = 4, i, j;
        int space = row - 1;

        // Loop to draw a diamond made of stars
        for (j = 1; j <= row; j++)
        {
            // Draws blank spaces for top 3 rows of stars
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            // Draws stars
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (j = 1; j<= row - 1; j++)
        {
            // Draws blank spaces for bottom 3 rows of stars
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            // Draws stars
            for (i = 1; i <= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
