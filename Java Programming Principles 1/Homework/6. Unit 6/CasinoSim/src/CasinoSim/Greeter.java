package CasinoSim;

public class Greeter {
    private String userName;

    public void setUserName(String un) {
        userName = un;
    }

    public String getUserName() {
        return userName;
    }

    public static String GAME_WELCOME_MESSAGE() {
        return """
                Welcome to the Casino Simulator!\s
                My name is Kyle.\s
                This was created to simulate the casino games BlackJack and Slot Machines.\s
                Class =  CPT421 Java Principles 1 @ Southwestern College.\s
                -------------------------------\040\040\040\040\040\040\040\040\040\040
                """;
    }

    public static String USERNAME_SUGGESTED() {
        return """
               Your username will help the game be more personable.\s
               It can be something from one letter to 25 letters.\s
               Type your desired username now:\s
               -------------------------------\040\040\040\040\040\040\040\040\040
               """;
    }
}
