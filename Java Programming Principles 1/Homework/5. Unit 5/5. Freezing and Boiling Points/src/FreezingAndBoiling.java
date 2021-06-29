/*
 * This program was written by Kyle Martin on 6/19/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to check if the users input of temperature would cause Ethyl, Oxygen, or Water to freeze or
 * boil.
 * See Chapter 6 Programming Challenge 11
 */
import java.util.Scanner;

public class FreezingAndBoiling {
    private double temperature;

    // Getters:
    public double getTemperature() {
        return  temperature;
    }
    public boolean isEthylFreezing() {
        final double ETHYL_FREEZING = -173.0;
        return temperature <= ETHYL_FREEZING;
    }
    public boolean isEthylBoiling() {
        final double ETHYL_BOILING = 172.0;
        return temperature >= ETHYL_BOILING;
    }
    public boolean isOxygenFreezing() {
        final double OXYGEN_FREEZING = -362.0;
        return temperature <= OXYGEN_FREEZING;
    }
    public boolean isOxygenBoiling() {
        final double OXYGEN_BOILING = -306.0;
        return temperature >= OXYGEN_BOILING;
    }
    public boolean isWaterFreezing() {
        final double WATER_FREEZING = 32.0;
        return temperature <= WATER_FREEZING;
    }
    public boolean isWaterBoiling() {
        final double WATER_BOILING = 212.0;
        return temperature >= WATER_BOILING;
    }

    // Setters:
    public void setTemperature(double givenTemperature) {
        temperature = givenTemperature;
    }

    // Class Methods:
    public void checkEthyl() {
        if (isEthylBoiling()) {
            System.out.println("Ethyl would be boiling.");
        } else if (isEthylFreezing()) {
            System.out.println("Ethyl would be freezing.");
        } else {
            System.out.println("Ethyl would not be boiling or freezing at " + getTemperature() + " degrees Fahrenheit.");
        }
    }
    public void checkOxygen() {
        if (isOxygenBoiling()) {
            System.out.println("Oxygen would be boiling.");
        } else if (isOxygenFreezing()) {
            System.out.println("Oxygen would be freezing.");
        } else {
            System.out.println("Oxygen would not be boiling or freezing at " + getTemperature() + " degrees Fahrenheit.");
        }
    }
    public void checkWater() {
        if (isWaterBoiling()) {
            System.out.println("Water would be boiling.");
        } else if (isWaterFreezing()) {
            System.out.println("Water would be freezing.");
        } else {
            System.out.println("Water would not be boiling or freezing at " + getTemperature() + " degrees Fahrenheit.");
        }
    }

    // Main to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FreezingAndBoiling checkTemps = new FreezingAndBoiling();

        System.out.println( "What is the temperature of the substance? Ex. 94.7 for 94.7 degrees Fahrenheit.");
        checkTemps.setTemperature(input.nextDouble());
        double userSubstanceTemperature = checkTemps.getTemperature();

        // Display Substance Reactions to Temperatures
        System.out.println("At " + userSubstanceTemperature + " degrees Fahrenheit:");
        checkTemps.checkEthyl();
        checkTemps.checkOxygen();
        checkTemps.checkWater();
    }
}
