/*
 * Book: Starting Out with Java, 7th Edition by Tony Gaddis
 * Program Author: Kyle Martin | https://github.com/thesnowmanndev
 * This program was created to calculate the amount of calories the user has consumed depending on how many cookies they
 * have eaten.
 * */
import java.util.Scanner;

public class CookieCalories {
    public static void main(String[] args) {
        greetUser();
        calculateCalories();
    }
    public static void calculateCalories() {
        Scanner userInput = new Scanner(System.in);
        int cookiesConsumed;
        final int COOKIES_PER_BAG = 40;
        final int SERVINGS_PER_BAG = 10;
        final int CALORIES_PER_SERVING = 300;
        final int COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS_PER_BAG;
        final int CALORIES_PER_COOKIE = CALORIES_PER_SERVING / COOKIES_PER_SERVING;
        int caloriesConsumed;

        System.out.println("How many cookies did you consume? Example 4 for four cookies.");
        cookiesConsumed = userInput.nextInt();
        caloriesConsumed = cookiesConsumed * CALORIES_PER_COOKIE;

        System.out.println("Each cookie is " + CALORIES_PER_COOKIE + " calories.");
        System.out.println("You consumed " + caloriesConsumed + " calories.");
    }
     private static void greetUser() {
        System.out.println("""
                Welcome to the Cookie Calorie Calculator!\s
                The intent of this program is to calculate how many calories you eat of cookies.\s
                The Bag of Cookies holds 40 cookies and has ten servings each being 300 calories.\s""");
    }
}
