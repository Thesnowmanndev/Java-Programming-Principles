/**
 * This program demonstrates creates the UnpaidOrder
 * table in the CoffeeDB database.
 */

import java.sql.*;   // Needed for JDBC classes

public class CreateUnpaidOrderTable
{
		static Connection conn;
		static Statement stmt;

   public static void main(String[] args)
   {
      // Create constants for the driver name and URL.
      // NOTE: These values are specific for Cloudscape.
      final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
      final String DB_URL = "jdbc:derby:CoffeeDB";
		
      
      try
      {
         // Load the JDBC driver.
         Class.forName(DRIVER);

         // Create a connection to the database.
         conn = DriverManager.getConnection(DB_URL);
         
         // Get a Statement object.
         stmt = conn.createStatement();
			
			stmt.execute("DROP TABLE UnpaidOrder");
			
         // Make an SQL statement to create the table.
         String sql = "CREATE TABLE UnpaidOrder " +
				"( CustomerNumber CHAR(10) NOT NULL REFERENCES Customer(CustomerNumber), "+
				"  ProdNum CHAR(10) NOT NULL REFERENCES Coffee(ProdNum),"+
				"  OrderDate CHAR(10),"+
				"  Quantity DOUBLE,"+
				"  Cost DOUBLE )";

         // Execute the statement.
         stmt.execute(sql);
         
         // Close the connection.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
			ex.printStackTrace();
      }
   }

	private void addRows() throws Exception
	{

         // Add some rows to the new table.
         String sql = "INSERT INTO UnpaidOrder VALUES" +
               "('101', '16-001', '3/15/2006', 5, 49.75)";
         stmt.executeUpdate(sql);
			
			sql = "INSERT INTO UnpaidOrder VALUES" +
               "('101', '14-001', '3/17/2006', 7, 62.65)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('102', '18-002', '3/20/2006', 10, 184.50)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('103', '17-004', '3/21/2006', 3, 35.85)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('103', '16-002', '3/22/2006', 6, 59.70)";
         stmt.executeUpdate(sql);
	}
}