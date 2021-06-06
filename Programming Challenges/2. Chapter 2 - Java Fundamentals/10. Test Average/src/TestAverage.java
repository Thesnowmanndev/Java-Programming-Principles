import java.text.DecimalFormat;
import java.util.Scanner;

public class TestAverage {
    static DecimalFormat testScoreFormat = new DecimalFormat("##.#");
    static Scanner userInput = new Scanner(System.in);

    private static void greetUser() {
        System.out.println("""
                            Hello, welcome to the Test Average Calculation Program! \s
                            This program will calculate your grade and average based on your last three test scores.\s
                            """);
    }
    private static double[] annotateScores(double firstTestScore, double secondTestScore, double thirdTestScore) {
        double [] testScores = new double[3];
        testScores[0] = firstTestScore;
        testScores[1] = secondTestScore;
        testScores[2] = thirdTestScore;

        return testScores;
    }
    private static double calculateScores(double firstTestScore, double secondTestScore, double thirdTestScore) {
        return (firstTestScore + secondTestScore + thirdTestScore) / 3;
    }
    public static void main(String[] args) {
        greetUser();

        System.out.println("** Note: All test scores will be a solid number or to the tenth decimal. Ex. 93.5 **");
        System.out.println("Input score for first test:");
        double firstTestScore = userInput.nextDouble();
        System.out.println("Input score for second test:");
        double secondTestScore = userInput.nextDouble();
        System.out.println("Input score for third test:");
        double thirdTestScore = userInput.nextDouble();

        double [] testScores = annotateScores(firstTestScore, secondTestScore, thirdTestScore);
        double averageTestScore = calculateScores(testScores[0], testScores[1], testScores[2]);

        String [] formattedScores = new String[4];
        formattedScores[0] = testScoreFormat.format(testScores[0]);
        formattedScores[1] = testScoreFormat.format(testScores[1]);
        formattedScores[2] = testScoreFormat.format(testScores[2]);
        formattedScores[3] = testScoreFormat.format(averageTestScore);

        int testAverageCase;
        if (averageTestScore >= 90.0 && averageTestScore <= 110) {
            testAverageCase = 1;
        } else if (averageTestScore >= 80.0 && averageTestScore <= 89.9) {
            testAverageCase = 2;
        } else if (averageTestScore >= 70.0 && averageTestScore <= 79.9) {
            testAverageCase = 3;
        } else if (averageTestScore >= 60.0 && averageTestScore <= 69.9) {
            testAverageCase = 4;
        } else {
            testAverageCase = 5;
        }

        System.out.println( "You scored " + formattedScores[0] + " on your first test.\n" +
                            "You scored " + formattedScores[1] + " on your second test.\n" +
                            "You scored " + formattedScores[2] + " on your third test.\n");

        switch (testAverageCase) {
            case 1 -> System.out.println(   "Your average test score was a " + testScoreFormat.format(averageTestScore) +
                    " and your average grade was a 'A'.");
            case 2 -> System.out.println(   "Your average test score was a " + testScoreFormat.format(averageTestScore) +
                    " and your average grade was a 'B'.");
            case 3 -> System.out.println(   "Your average test score was a " + testScoreFormat.format(averageTestScore) +
                    " and your average grade was a 'C'.");
            case 4 -> System.out.println(   "Your average test score was a " + testScoreFormat.format(averageTestScore) +
                    " and your average grade was a 'D'.");
            case 5 -> System.out.println(   "Your average test score was a " + testScoreFormat.format(averageTestScore) +
                    " and your average grade was a 'F'.");
            default -> System.out.println(  "You entered your scores incorrectly. Please try again.");
        }
    }
}
