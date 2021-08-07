/*
 * This program was written by Kyle Martin on 8/7/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to sum a total from a database
 * See Chapter 16 Programming Challenges  - Challenge Three.
 */
import java.sql.*;

public class UnpaidOrderCost {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/CoffeeDB";
        String DB_USER = "root";
        String DB_Pass = "password"; //Actual password changed, also hard coding secrets isn't a good idea

        try {
            Connection DBConnection;
            DBConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_Pass);
            Statement DBStatement = DBConnection.createStatement();

            String DBCommand = "SELECT SUM(Cost) FROM UnpaidOrder";
            ResultSet result = DBStatement.executeQuery(DBCommand);

            if (result.next())
                System.out.println("Total Cost = " + result.getDouble(1));

            DBStatement.close();
            DBConnection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error:" + throwables.getMessage());
        }
    }
}
