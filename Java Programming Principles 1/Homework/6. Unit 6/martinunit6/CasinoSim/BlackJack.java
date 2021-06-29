/*
 * This program was written by Kyle Martin on 6/25/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This java class file handles the logic of Blackjack and the gameplay of blackjack dice variant in a casino
 */

package CasinoSim;

import java.util.Scanner;

public class BlackJack {
    /* Requirements */
    // 1. Play must be a loop while under 21
    // 2. Roll dice? 2 six sided dice
    // 3. Round start, simulate rolling two six-sided dice. Roll for computer first. Ask user whether or not want to roll dice
    // 4. Loop keeps a running total of both computer and users points
    // 5. Computers total remains hidden till loop has finished
    // 6. After loop completes, reveal computer total, player with most points without going over 21 wins
    // 7. ask play again. If so repeat. In exit display total amount of money won as well as balance

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
        System.out.println( "Welcome to the Blackjack game mode!\n");
        System.out.println("""
                ---------------------\s
                In this variation of Blackjack you will play against a computer.\s
                The goal to get as close to 21 points without getting over.\s
                However, instead of cards you will choose to roll two six-sided dice to earn points.\s
                Once you decide to stop rolling the computers points will be revealed and the one\s
                closest to 21 without breaking will win the round!
                ---------------------\s
                """);
    }

    // Check if user wants to replay
    public boolean replay(String replayChoice){
        String flag = replayChoice.toLowerCase();
        return flag.equals("y");
    }

    // Check if user wants to roll again
    public boolean rollAgain(String rollAgain){
        String flag = rollAgain.toLowerCase();
        return flag.equals("y");
    }

    // Play the Game
    public void playBlackjack(Greeter greeter, Scanner input, MoneyHandler moneyHandler) {
        moneyHandler.checkForSaveFile();
        initialMoney = moneyHandler.getMoneyBalance();
        long accountBalance = moneyHandler.getMoneyBalance();

        /* Ensure money available for play */
        if (accountBalance == 0) {
            moneyHandler.depositMoney(greeter, input);
        }

        setTotalWinnings();
        String replayChoice;
        boolean replayFlag = true;

        while (replayFlag) {
            //Start bet
            System.out.println( "How much would you like to bet? Your account balance is $"
                                + moneyHandler.getMoneyBalance() + ".\n");
            long betMoney = input.nextLong();
            if (betMoney > accountBalance) {
                System.out.println("You do not have enough for that bet. Please enter a valid number.");
                playBlackjack(greeter, input, moneyHandler);
            }

            // Roll Dice
            Die userFirstDice = new Die(6);
            Die userSecondDice = new Die(6);
            Die computerFirstDice = new Die(6);
            Die computerSecondDice = new Die(6);
            int goalScore = 21;
            int computerScore = 0;
            int userScore = 0;

            // Computer Dice roll logic
            while (computerScore < goalScore) {
                computerFirstDice.rollDice();
                computerSecondDice.rollDice();
                int computerDiceOutput = computerFirstDice.getDieValue() + computerSecondDice.getDieValue();
                computerScore += computerDiceOutput;
            }

            // User Dice Roll Logic
            boolean continueRoll = true;
            String rollDiceChoice;
            while (continueRoll) {
                userFirstDice.rollDice();
                userSecondDice.rollDice();
                userScore += userFirstDice.getDieValue() + userSecondDice.getDieValue();
                System.out.println("Your current score is " + userScore);
                System.out.println("Would you like to roll the dice?  (y or n)");
                rollDiceChoice = input.next();
                continueRoll = rollAgain(rollDiceChoice);
            }

            System.out.println("--------------------");
            System.out.println("Computer Scored " + computerScore);
            System.out.println("Player Scored " + userScore);
            System.out.println("--------------------");

            // Show Result of Play
            /* Check if computer busted score and player didnt */
            if (computerScore > goalScore && userScore <= goalScore) {
                System.out.println("The computer rolled a combined value of " + computerScore + ".");
                System.out.println("You had a combined value of " + userScore + ".");
                winningMoney = betMoney * 2;
                System.out.println("You won $" + winningMoney + "!");
                initialMoney += winningMoney;
                System.out.println("--------------------");
            }
            /* Check if computer was under and player busted */
            else if (computerScore <= goalScore &&  userScore > goalScore) {
                System.out.println("The computer rolled a combined value of " + computerScore + ".");
                System.out.println("You had a combined value of " + userScore + ".");
                winningMoney -= betMoney;
                System.out.println("You lost $" + winningMoney + ".");
                initialMoney -= betMoney;
                System.out.println("--------------------");
            }
            /* Check for Computer & player under goal but computer higher */
            else if (computerScore <= goalScore && userScore <= goalScore && computerScore > userScore) {
                System.out.println("The computer rolled a combined value of " + computerScore + ".");
                System.out.println("You had a combined value of " + userScore + ".");
                winningMoney -= betMoney;
                System.out.println("You lost $" + winningMoney + ".");
                initialMoney -= betMoney;
                System.out.println("--------------------");
            }
            /* Check for Computer & Player under goal but player higher */
            else if (computerScore <= goalScore && userScore <= goalScore && computerScore < userScore) {
                System.out.println("The computer rolled a combined value of " + computerScore + ".");
                System.out.println("You had a combined value of " + userScore + ".");
                winningMoney = betMoney * 2;
                System.out.println("You won $" + winningMoney + "!");
                initialMoney += winningMoney;
                System.out.println("--------------------");
            }
            /* Check for Tie */
            else if (computerScore == goalScore || userScore == goalScore) {
                System.out.println("The computer rolled a combined value of " + computerScore + ".");
                System.out.println("You had a combined value of " + userScore + ".");
                System.out.println("Tie Game.");
                System.out.println("--------------------");
            }


            System.out.println("Your balance is: $" + initialMoney);


            // Show total winnings
            System.out.println("--------------------");
            totalWinnings += winningMoney;
            /* Ensure total winnings doesnt display negative value */
            if (totalWinnings <= 0) {
                setTotalWinnings();
            }
            System.out.println("Your total winnings so far is $" + totalWinnings);

            // Replay Check
            System.out.println("--------------------");
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
