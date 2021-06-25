package CasinoSim;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MoneyHandler {
    private long moneyBalance;

    public void setMoneyBalance(long balance) {
        moneyBalance = balance;
    }

    public void depositMoney(Greeter greeter, Scanner input) {
        System.out.println("How much would you like to deposit? Minimum $20 Maximum $1000");
        int depositedMoney = input.nextInt();
        if (depositedMoney > 1000) {
            System.out.println("Invalid amount, too high!");
        } else if (depositedMoney < 20) {
            System.out.println("Invalid amount, too low!");
        } else {
            setMoneyBalance(depositedMoney);
            System.out.println("Your Balance is $" + getMoneyBalance());
            SaveAndExit.saveBalance(greeter, (long) depositedMoney);
        }
    }

    public long getMoneyBalance() {
        return moneyBalance;
    }

    public void checkForSaveFile() {
        File jsonSaveFile = new File("CasinoSim.json");
        if (jsonSaveFile.exists()) {
            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(new FileReader("CasinoSim.json"));
                JSONObject jsonObject = (JSONObject) obj;
                long balance = (long) jsonObject.get("balance");
                setMoneyBalance(balance);
                System.out.println("Your Balance is $" + getMoneyBalance());
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Save File not found.");
        }
    }
}
