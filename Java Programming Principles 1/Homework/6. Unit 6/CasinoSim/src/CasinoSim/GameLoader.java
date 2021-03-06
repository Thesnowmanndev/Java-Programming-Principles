package CasinoSim;

import java.util.Scanner;

public class GameLoader {
    private int gameChoice;
    Scanner input = new Scanner(System.in);

    public String chooseGameMessage() {
        return "Please choose a game by typing in a number.";
    }

    public String gameChoices() {
        return """
                The casino currently offers:\s
                1. Slot Machine\s
                2. BlackJack\s
                3. Exit
                """;
    }

    public void setGameChoice() {
        System.out.println(gameChoices());
        System.out.println(chooseGameMessage());
        gameChoice = input.nextInt();
        if (gameChoice <= 0 || gameChoice >= 4) {
            input.nextLine();
            System.out.println("Please retype your choice.");
            gameChoice = input.nextInt();
        }
    }

    public int getGameChoice() {
        return gameChoice;
    }

    public void loadGameChoice(Greeter greeter, Scanner input, MoneyHandler moneyHandler) {
        int chosenGame = getGameChoice();
        if (chosenGame == 1) {
            loadSlotMachine(greeter, input, moneyHandler);
        } else if (chosenGame == 2) {
            loadBlackjack(greeter, input, moneyHandler);
        } else if (chosenGame == 3) {
            System.out.println("Goodbye, see you next time " + greeter.getUserName() + ".");
            System.exit(0);
        } else {
            System.out.println("Please type a correct option.");
        }
    }

    public void loadSlotMachine(Greeter greeter, Scanner input, MoneyHandler moneyHandler) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.startMessage();
        slotMachine.playSlots(greeter, input, moneyHandler);
    }

    public void loadBlackjack(Greeter greeter, Scanner input, MoneyHandler moneyHandler) {
        BlackJack blackJack = new BlackJack();
        blackJack.startMessage();
        blackJack.playBlackjack(greeter, input, moneyHandler);
    }
}
