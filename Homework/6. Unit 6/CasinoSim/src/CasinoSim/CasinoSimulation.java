package CasinoSim;

import java.util.Scanner;

public class CasinoSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greeter greeter = new Greeter();

        // Welcome Message:
        System.out.println(Greeter.GAME_WELCOME_MESSAGE());

        // Check for Save File:
        SaveAndExit.checkForSaveFile(greeter, input);

        // Welcome User:
        System.out.println("Welcome " + greeter.getUserName() + ".");

        // Offer Game Selection
        GameLoader gameLoader = new GameLoader();
        System.out.println(gameLoader.chooseGameMessage());
        gameLoader.setGameChoice();

        // Load Chosen Game
        gameLoader.loadGameChoice(greeter, input);
    }
}
