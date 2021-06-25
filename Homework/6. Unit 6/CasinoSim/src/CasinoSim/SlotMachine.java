/*
 * This program was written by Kyle Martin on 6/25/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This java class file handles the logic of the Slot Machine and the gameplay of slots in a casino
 */

package CasinoSim;

import java.util.Scanner;

public class SlotMachine {
    long initialMoney;
    long winningMoney;
    long totalWinnings;

    private void setTotalWinnings() {
        totalWinnings = 0;
    }

    public double getTotalWinnings() {
        return winningMoney;
    }

    // Welcome the User
    public void startMessage() {
        System.out.println("Welcome to the Slot Machine game mode!\n");
    }

    // Generate random number 0-5 for Slot Machine word array
    public int generateRandom(){
        return (int) Math.round(Math.random() * 5);
    }

    // Check if user wants to replay
    public boolean replay(String replayChoice){
        String flag = replayChoice.toLowerCase();
        return flag.equals("y");

    }

    // Set the three slots
    public String[] initializeThreeSlots(String[] words){
        String[] checkSlots = new String[3];

        for(int i = 0; i < 3; i++){
            int randomIndex = generateRandom();
            switch (randomIndex) {
                case 0 -> checkSlots[i] = words[0];
                case 1 -> checkSlots[i] = words[1];
                case 2 -> checkSlots[i] = words[2];
                case 3 -> checkSlots[i] = words[3];
                case 4 -> checkSlots[i] = words[4];
                case 5 -> checkSlots[i] = words[5];
            }
        }
        return checkSlots;
    }

    // Check the three slots for matches
    public double checkTheSlotMachine(String[] checkSlots, long betMoney){
        double money = 0.0;
        if(checkSlots[0].equals(checkSlots[1]) && checkSlots[0].equals(checkSlots[2])){
            money = betMoney * 3;
            winningMoney += money;
            System.out.println("\nALL THREE MATCH!");
        }
        else if(checkSlots[0].equals(checkSlots[1]) || checkSlots[0].equals(checkSlots[2]) ||
                checkSlots[1].equals(checkSlots[2])){
            money = betMoney * 2;
            winningMoney += money;
            System.out.println("\nTWO SLOTS MATCH!");
        }
        else{
            money -= betMoney;
            System.out.println("You earned $0");
        }
        return money;
    }

    // Play the Game
    public void playSlots(Greeter greeter, Scanner input, MoneyHandler moneyHandler) {
        moneyHandler.checkForSaveFile();
        initialMoney = moneyHandler.getMoneyBalance();
        long accountBalance = moneyHandler.getMoneyBalance();

        /* Ensure money available for play */
        if (accountBalance == 0) {
            moneyHandler.depositMoney(greeter, input);
        }
        setTotalWinnings();
        String[] words = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
        String[] checkSlots;
        String replayChoice;
        boolean replayFlag = true;

        // Gameplay loop
        while(replayFlag) {
            checkSlots = initializeThreeSlots(words);

            // Start Bet
            System.out.println("How much money you want to bet? ");
            long betMoney = input.nextLong();
            if (betMoney > accountBalance) {
                System.out.println("You do not have enough for that bet. Please enter a valid number.");
                playSlots(greeter, input, moneyHandler);
            }

            // Run slots
            System.out.println("\n--------------------");
            System.out.println("Slot Machine Shows:");
            System.out.println(checkSlots[0] + " " + checkSlots[1] + " " + checkSlots[2]);
            winningMoney = (long) checkTheSlotMachine(checkSlots, betMoney);

            // Show result of play
            System.out.println("--------------------");
            System.out.println("Result: " + winningMoney);
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            initialMoney += winningMoney;
            System.out.println("Your balance is: $" + initialMoney);
            totalWinnings += winningMoney;

            /* Ensure total winnings doesnt display negative value */
            if (getTotalWinnings() <= 0) {
                setTotalWinnings();
            }
            System.out.println("Your total winnings so far is $" + totalWinnings);

            // Replay Check
            System.out.println("\nYou want to play again? (y or n)");
            replayChoice = input.next();
            replayFlag = replay(replayChoice);
            if (replayFlag) {
                /* Check to ensure balance is less than or equal to 0 before replay */
                if (initialMoney <= 0) {
                    moneyHandler.depositMoney(greeter, input);
                    initialMoney = moneyHandler.getMoneyBalance();
                }
            }
            // Exit Slots
            if(!replayFlag){
                SaveAndExit.saveBalance(greeter, initialMoney);
                System.out.println("Balance Saved. Exiting Program.");
                break;
            }
        }
    }
}