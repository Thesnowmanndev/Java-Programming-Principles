package CasinoSim;

import java.util.Scanner;

public class GameLoader {
    private int gameChoice;
    Scanner input = new Scanner(System.in);

    public String gameChoices() {
        return """
                The casino currently offers:\s
                1. Slot Machine\s
                2. BlackJack\s
                3. Exit
                """;
    }

    public String chooseGameMessage() {
        return "Please choose a game by typing in a number.";
    }

    public void setGameChoice() {
        System.out.println(gameChoices());
        System.out.println(chooseGameMessage());
        int gameChoice = input.nextInt();
        while (gameChoice <= 0 || gameChoice >= 4) {
            System.out.println("Please retype your choice.");
            gameChoice = input.nextInt();
        }
    }

    public int getGameChoice() {
        return gameChoice;
    }
}
