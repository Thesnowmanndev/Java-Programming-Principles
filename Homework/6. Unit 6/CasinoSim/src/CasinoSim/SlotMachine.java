package CasinoSim;

import java.util.Scanner;

public class SlotMachine {
    long initialMoney;
    long winningMoney;

    public double getTotalWinnings() {
        return winningMoney;
    }

    public void startMessage() {
        System.out.println("Welcome to the Slot Machine game mode!\n");
    }

    public int generateRandom(){
        return (int) Math.round(Math.random() * 5);
    }

    public boolean replay(String replayChoice){
        String flag = replayChoice.toLowerCase();
        return flag.equals("y");

    }

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

    public void playSlots(Greeter greeter, Scanner input) {
        MoneyHandler moneyHandler = new MoneyHandler();
        moneyHandler.checkForSaveFile();
        initialMoney = moneyHandler.getMoneyBalance();
        String[] words = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
        String[] checkSlots;
        String replayChoice;
        boolean flag = true;

        while(flag){
            checkSlots = initializeThreeSlots(words);
            System.out.println("How much money you want to bet? ");
            // Check if balance exists
            long betMoney = input.nextLong();

            System.out.println("\n--------------------");
            System.out.println("Slot Machine Shows:");
            System.out.println(checkSlots[0] + " " + checkSlots[1] + " " + checkSlots[2]);
            winningMoney = (long) checkTheSlotMachine(checkSlots, betMoney);

            System.out.println("--------------------");
            // Format result money to show -$
            System.out.println("Result: " + winningMoney);
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            initialMoney += winningMoney;
            System.out.println("Your balance is: $" + initialMoney);
            // Keep track of total money won or lost

            System.out.println("\nYou want to play again? (y or n)");
            replayChoice = input.next();
            flag = replay(replayChoice);
            if(!flag){
                SaveAndExit.saveBalance(greeter, initialMoney);
                System.out.println("Balance Saved. Exiting Program.");
                break;
            }
        }
    }
}
