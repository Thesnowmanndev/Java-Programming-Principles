package CasinoSim;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Scanner;

public class SaveAndExit {
    public static void checkForSaveFile(Greeter greeter, Scanner input) {
        File jsonSaveFile = new File("CasinoSim.json");
        if (jsonSaveFile.exists()) {
            SaveAndExit.loadSaveFile(greeter);
        }
        else {
            // Create Username:
            while (greeter.getUserName() == null || greeter.getUserName().equals("")) {
                SaveAndExit.createUsername(greeter, input);
            }
        }
    }

    public static void createUsername(Greeter greeter, Scanner input) {
        JSONObject saveFile = new JSONObject();

        System.out.println(Greeter.USERNAME_SUGGESTED());
        String username = input.nextLine();
        while (username == null || username.equals("")) {
            System.out.println("Please type a username for the game.");
            username = input.nextLine();
        }
        greeter.setUserName(username);

        saveFile.put("username", greeter.getUserName());
        saveFile.put("balance", 0);

        try (FileWriter file = new FileWriter("CasinoSim.json")) {
            file.write(saveFile.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadSaveFile(Greeter greeter) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("CasinoSim.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String username = (String) jsonObject.get("username");
            // int balance = (int) jsonObject.get("balance");
            greeter.setUserName(username);
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
