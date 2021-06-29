/*
 * This program was written by Kyle Martin on 6/19/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to build Programming Challenge 4 of Chapter 8
 * See Chapter 8 Programming Challenge 4. LandTract
 */
import java.util.Scanner;

public class LandTract {
    private double tractLength;
    private double tractWidth;
    private double tractArea;

    // Getters
    public double getTractLength() {
        return tractLength;
    }

    public double getTractWidth() {
        return tractWidth;
    }

    public double getTractArea() {
        return tractArea;
    }

    // Setters
    public void setTractLength(double setTractLength) {
        tractLength = setTractLength;
    }

    public void setTractWidth(double setTractWidth) {
        tractWidth = setTractWidth;
    }

    // Constructor
    public LandTract(double setTractLength, double setTractWidth) {
        tractLength = setTractLength;
        tractWidth = setTractWidth;
        tractArea = tractLength * tractWidth;
    }

    // Methods
    public boolean equals(double tArea1, double tArea2) {
        return tArea1 == tArea2;
    }

    public String toString() {
        String str = "Tracts area is " + tractArea + ".";
        return str;
    }

    // Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create First Land Tract
        System.out.println("Please input the length of your first tract.");
        double firstTractLength = input.nextDouble();
        System.out.println("Please input the width of your first tract.");
        double firstTractWidth = input.nextDouble();
        LandTract tractOne = new LandTract(firstTractLength, firstTractWidth);

        // Create Second Land Tract
        System.out.println("Please input the length of your second tract.");
        double secondTractLength = input.nextDouble();
        System.out.println("Please input the width of your second tract.");
        double secondTractWidth = input.nextDouble();
        LandTract tractTwo = new LandTract(secondTractLength, secondTractWidth);

        // Get tract areas
        double tractOneArea = tractOne.getTractArea();
        double tractTwoArea = tractTwo.getTractArea();

        System.out.println("The first tracts area is " + tractOne.toString());
        System.out.println("The second tracts area is " + tractTwo.toString());

        // Check if tracts areas are equal
        if (tractOne.equals(tractOneArea, tractTwoArea)) {
            System.out.println("The two tracts are the same size of area.");
        } else {
            System.out.println("The two tracts are not equal in size of area.");
        }
    }
}
