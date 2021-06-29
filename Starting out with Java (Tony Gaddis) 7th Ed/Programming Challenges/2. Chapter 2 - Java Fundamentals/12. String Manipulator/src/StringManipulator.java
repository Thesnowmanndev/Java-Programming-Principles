import java.util.Scanner;

public class StringManipulator {
    /*
    Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store
    the input. The program should display the following:

    - The number of characters in the city name
    - The name of the city in all uppercase letters
    - The name of the city in all lowercase letters
    - The first character in the name of the city
    */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String favoriteCity;

        System.out.println("What is the name of your favorite city?");
        favoriteCity = keyboard.next();

        int cityNameLength = favoriteCity.length();
        System.out.println("There are " + cityNameLength + " characters in " + favoriteCity + ".");
        String cityNameUpper = favoriteCity.toUpperCase();
        System.out.println(cityNameUpper + " is the version of your favorite city's name in all capitalized characters.");
        String cityNameLower = favoriteCity.toLowerCase();
        System.out.println(cityNameLower + " is the version of your favorite city's name in all lowercase characters.");
        char firstLetter = favoriteCity.charAt(0);
        System.out.println("Your favorite city starts with the letter " + firstLetter);
    }
}
