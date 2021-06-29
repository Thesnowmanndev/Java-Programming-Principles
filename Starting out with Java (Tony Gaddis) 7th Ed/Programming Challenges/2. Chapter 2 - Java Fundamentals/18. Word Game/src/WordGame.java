import java.util.Scanner;

public class WordGame {
    /*
    Write a program that plays a word game with the user. The program should ask the user to enter the following:

        - His or her name
        - His or her age
        - The name of a city
        - The name of a college
        - A profession
        - A type of animal
        - A pet’s name

    After the user has entered these items, the program should display the following story, inserting the user’s input
    into the appropriate locations:

        There once was a person named  NAME  who lived in  CITY. At the age of  AGE,
        NAME  went to college at COLLEGE.NAME  graduated and went to work as a
        PROFESSION. Then,  NAME  adopted a(n)  ANIMAL  named  PETNAME. They both lived
        happily ever after!
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("""
                Lets play a word game!

                """);

        System.out.println( "What is your name?");
        String  name    =   keyboard.nextLine();

        System.out.println( "What is your age?");
        int age =   keyboard.nextInt();

        keyboard.nextLine();

        System.out.println( "What is the name of the city you live in?");
        String  cityName    =   keyboard.nextLine();

        System.out.println( "What is the name of the school you go to?");
        String  schoolName  =   keyboard.nextLine();

        System.out.println( "What is your profession?");
        String  professionName  =   keyboard.nextLine();

        System.out.println( "What is your favorite type of animal?");
        String  favoriteAnimal  =   keyboard.nextLine();

        System.out.println( "What would be the name of your next pet?");
        String  animalName  =   keyboard.nextLine();

        System.out.println("\n");

        System.out.println( "There once was a person named " +   name    +  " who lived in " +   cityName    + "."   +
                            " At the age of "    +   age + ", "  +   name    +   " went to college at "  +
                            schoolName  +   ". "    +   name    + " graduated and went to work as a "   +
                            professionName  + ". Then, "    +   name    +  " adopted a(n) " +   favoriteAnimal  +
                            " named "   +   animalName  +   ". They both lived happily ever after!");
    }
}
