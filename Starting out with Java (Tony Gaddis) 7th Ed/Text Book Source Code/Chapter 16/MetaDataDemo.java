/**
 * This program demonstrates result set meta data.
 */

import java.sql.*;
import java.util.Scanner;

public class MetaDataDemo
{
   public static void main(String[] args) throws Exception
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Create a Scanner object for keyboard input.
         Scanner keyboard = new Scanner(System.in);
         
         // Get a SELECT statement from the user.
         System.out.println("Enter a SELECT statment for " +
                            "the CoffeeDB database:");
         String sql = keyboard.nextLine();
         
         // Create a connection to the database.
         Connection conn =
                DriverManager.getConnection(DB_URL);
            
         // Create a Statement object.
         Statement stmt = conn.createStatement();
            
         // Execute the query.
         ResultSet resultSet = stmt.executeQuery(sql);
            
         // Get the result set meta data.
         ResultSetMetaData meta = resultSet.getMetaData();
            
         // Display the number of columns returned.
         System.out.println("The result set has " +
                            meta.getColumnCount() +
                            " column(s).");
                               
         // Display the column names and types.
         for (int i = 1; i <= meta.getColumnCount(); i++)
         {
            System.out.println(meta.getColumnName(i) + ", " +
                               meta.getColumnTypeName(i));
         }
            
         // Display the contents of the rows.
         System.out.println("\nHere are the result set rows:");
         while (resultSet.next())
         {
            // Display a row.
            for (int i = 1; i <= meta.getColumnCount(); i++)
            {
               System.out.print(resultSet.getString(i));
            }
            System.out.println();
         }
   
         // Close the statement and the connection.
         stmt.close();
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }     
   }
}