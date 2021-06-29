import java.util.Scanner;

public class PlantingGrapevines {
/*    A vineyard owner is planting several new rows of grapevines and needs to know how many grapevines to plant in each
    row. She has determined that after measuring the length of a future row, she can use the following formula to
    calculate the number of vines that will fit in the row, along with the trellis end-post assemblies that will need to
    be constructed at each end of the row:

    V=R−2ES

    The terms in the formula are:
    V is the number of grapevines that will fit in the row.
    R is the length of the row, in feet.
    E is the amount of space used by an end-post assembly.
    S is the space between vines, in feet.

    Write a program that makes the calculation for the vineyard owner. The program should ask the user to input the
    following:
    - The length of the row, in feet
    - The amount of space used by an end-post assembly, in feet
    - The amount of space between the vines, in feet

    Once the input data has been entered, the program should calculate and display the number of grapevines that will
    fit in the row.*/

    private static final Scanner input = new Scanner(System.in);
    private double numberOfGrapevinesPerRow;
    // in feet:
    private double lengthOfRow;
    private double spacePerEndPost;
    private double spaceBetweenVines;

    public double calculateNumberOfGrapevines() {
        double V;
        double R =  getLengthOfRow();
        double E = getSpacePerEndPost();
        double S = getSpaceBetweenVines();

        V = R - (2 * E * S);

        return  V;
    }

    public void setNumberOfGrapevinesPerRow(int numberOfGrapevinesPerRowInput) {
        numberOfGrapevinesPerRow = numberOfGrapevinesPerRowInput;
    }

    public void setLengthOfRow(double lengthOfRowInput) {
        lengthOfRow = lengthOfRowInput;
    }

    public void setSpacePerEndPost(double spacePerEndPostInput) {
        spacePerEndPost = spacePerEndPostInput;
    }

    public void setSpaceBetweenVines(double spaceBetweenVinesInput) {
        spaceBetweenVines = spaceBetweenVinesInput;
    }

    public double getNumberOfGrapevinesPerRow() {
        return numberOfGrapevinesPerRow;
    }

    public double getLengthOfRow() {
        return lengthOfRow;
    }

    public double getSpacePerEndPost() {
        return spacePerEndPost;
    }

    public double getSpaceBetweenVines() {
        return spaceBetweenVines;
    }


    public static void main(String[] args) {
        PlantingGrapevines plantingGrapevines = new PlantingGrapevines();

        System.out.println( "Grapevines per row Calculator\n");

        System.out.println( "What is the length of the row? (in ft)");
        plantingGrapevines.setLengthOfRow(input.nextDouble());
        System.out.println( "How much space does your end post occupy? (in ft)");
        plantingGrapevines.setSpacePerEndPost(input.nextDouble());
        System.out.println( "How much space is between the vines? (in ft)");
        plantingGrapevines.setSpaceBetweenVines(input.nextDouble());
        System.out.println( "\nYou input:");
        System.out.println( "Length of row: " + plantingGrapevines.getLengthOfRow() + "ft.");
        System.out.println( "Space for End-post: " + plantingGrapevines.getSpacePerEndPost() + "ft.");
        System.out.println( "Space between vines: " + plantingGrapevines.getSpaceBetweenVines() + "ft.");
        System.out.println("\nYour Calculation:");
        plantingGrapevines.setNumberOfGrapevinesPerRow((int) plantingGrapevines.calculateNumberOfGrapevines());
        System.out.println(plantingGrapevines.getNumberOfGrapevinesPerRow() + " grapevines per row.");
    }
}
