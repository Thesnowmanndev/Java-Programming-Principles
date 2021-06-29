
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MagicEightBall {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String filePathName = "src/8_ball_responses.txt";
        final int NUMBER_OF_LINES = 12;
        ArrayList<String> responses = new ArrayList<String>();

        int startIndex = 1;
        try {
            Scanner fileRead = new Scanner(new File(filePathName));

            while (fileRead.hasNextLine()) {
                responses.set(startIndex, fileRead.nextLine());
                startIndex++;
            }

            fileRead.close();

            System.out.println(responses);

            /*System.out.println("Ask the Magic 8 Ball a Question and press enter:");
            String askedQuestion = keyboard.nextLine();
            System.out.println("Type in a number between 1 - 12 and press enter.");
            int userChoice = keyboard.nextInt();
            System.out.println("Your question was: " + askedQuestion);
            System.out.println("The Magic 8 Ball Replies with: " + responses[4]);*/

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }
}
