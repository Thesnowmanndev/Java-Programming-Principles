package CasinoSim;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

public class MoneyHandler {
    private long moneyBalance;

    public void setMoneyBalance(long balance) {
        moneyBalance = balance;
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
