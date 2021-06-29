import java.io.*;

/**
   This class manages a random access file which contains
   InventoryItem records.
*/

public class InventoryItemFile
{
   private final int RECORD_SIZE = 44;
   private RandomAccessFile inventoryFile; 
   
   /**
      The constructor opens a random access file
      for both reading and writing.
      @param filename The name of the file.
      @exception FileNotFoundException When the file
                 is not found.
   */
   
   public InventoryItemFile(String filename)
                         throws FileNotFoundException
   {
      // Open the file for reading and writing.
      inventoryFile =
           new RandomAccessFile(filename, "rw");
   }
   
   /**
      The writeInventoryItem method writes the contents
      of an InventoryItem object to the file at the
      current file pointer position.
      @param item The InventoryItem object to write.
      @exception IOException When a file error occurs.
   */

   public void writeInventoryItem(InventoryItem item)
                                  throws IOException
   {
      // Get the item's description.
      String str = item.getDescription();
      
      // Write the description.
      if (str.length() > 20)
      {
         // If there are more than 20 characters in the
         // string, then write only the first 20.
         for (int i = 0; i < 20; i++)
            inventoryFile.writeChar(str.charAt(i));
      }
      else
      {
         // Write the description to the file.
         inventoryFile.writeChars(str);
         // Write enough spaces to pad it out
         // to 20 characters.
         for (int i = 0; i < (20 - str.length()); i++)
            inventoryFile.writeChar(' ');
      }
      
      // Write the units to the file.
      inventoryFile.writeInt(item.getUnits());
   }
   
   /**
      The readInventoryItem method reads and returns
      the record at the current file pointer position.
      @return A reference to an InventoryItem object.
      @exception IOException When a file error occurs.
   */

   public InventoryItem readInventoryItem()
                               throws IOException
   {
      char[] charArray = new char[20];
      
      // Read the description, character by character,
      // from the file into the char array.
      for (int i = 0; i < 20; i++)
         charArray[i] = inventoryFile.readChar();
         
      // Store the char array in a String.
      String desc = new String(charArray);
      
      // Trim any trailing spaces from the string.
      desc.trim();
      
      // Read the units from the file.
      int u = inventoryFile.readInt();
      
      // Create an InventoryItem object and initialize
      // it with these values.
      InventoryItem item =
             new InventoryItem(desc, u);
      
      // Return the object.
      return item;
   }

   /**
      The getByteNum method returns a record's
      starting byte number.
      @param recordNum The record number of the
                       desired record.
   */

   private long getByteNum(long recordNum)
   {
      return RECORD_SIZE * recordNum;
   }
   
   /**
      The moveFilePointer method moves the file
      pointer to a specified record.
      @param recordNum The number of the record to
                       move to.
      @exception IOException When a file error occurs.
   */

   public void moveFilePointer(long recordNum)
                            throws IOException
   {
      inventoryFile.seek(getByteNum(recordNum));
   }

   /**
      The getNumberOfRecords method returns the number
      of records stored in the file.
      @return The number of records in the file.
      @exception IOException When a file error occurs.
   */
   
   public long getNumberOfRecords() throws IOException
   {
      return inventoryFile.length() / RECORD_SIZE;
   }
   
   /**
      The close method closes the file.
      @exception IOException When a file error occurs.
   */
   
   public void close() throws IOException
   {
      inventoryFile.close();
   }
}
