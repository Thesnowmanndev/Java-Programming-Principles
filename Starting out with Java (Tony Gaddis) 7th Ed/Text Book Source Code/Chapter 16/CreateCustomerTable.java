import java.sql.*;   // Needed for JDBC classes

/**
 * This program demonstrates creates a Customer
 * table in the CoffeeDB database.
 */
 
public class CreateCustomerTable
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
         
         // Get a Statement object.
         Statement stmt = conn.createStatement();
         
         // Make an SQL statement to create the table.
         String sql = "CREATE TABLE Customer" +
            "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(25),"    +
            "  Address CHAR(25)," +
            "  City CHAR(12),"    +
            "  State CHAR(2),"    +
            "  Zip CHAR(5) )";

         // Execute the statement.
         stmt.execute(sql);
         
         // Add some rows to the new table.
         sql = "INSERT INTO Customer VALUES" +
               "('101', 'Downtown Cafe', '17 N. Main Street'," +
               " 'Asheville', 'NC', '55515')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Customer VALUES" +
               "('102', 'Main Street Grocery'," +
               " '110 E. Main Street'," +
               " 'Canton', 'NC', '55555')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Customer VALUES" +
               "('103', 'The Coffee Place', '101 Center Plaza'," +
               " 'Waynesville', 'NC', '55516')";
         stmt.executeUpdate(sql);

         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
