import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        // Declarations
        Scanner appScanner = new Scanner(System.in);
        float milesDriven;
        float gallonsUsed;
        float milesPerGallon;

        // Questions & Assignment
        System.out.println("This program will calculate the mileage of your vehicle. \n" +
                "How many miles did you drive? Example: 14.5 or 14.");
        milesDriven = appScanner.nextFloat();
        System.out.println("How many gallons of gas did you use? Example: 4.");
        gallonsUsed = appScanner.nextFloat();

        // Calculations
        milesPerGallon = milesDriven / gallonsUsed;
        float milesPerGallonRounded = (float) (Math.round(milesPerGallon * 10) / 10.0);

        // Output
        System.out.println("You drove " + milesDriven + " miles. " + "You used " + gallonsUsed + " gallons. " +
                "You achieved " + milesPerGallonRounded + "mpg.");
    }
}
