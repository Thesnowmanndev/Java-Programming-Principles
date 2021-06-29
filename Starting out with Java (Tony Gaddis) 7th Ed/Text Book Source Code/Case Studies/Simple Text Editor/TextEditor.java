import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
   The TextEditor class is a simple text editor.
*/

public class TextEditor extends JFrame
{
   // The following are fields for the menu system.
   // First, the menu bar
   private JMenuBar menuBar;
   
   // The menus
   private JMenu fileMenu;
   private JMenu fontMenu;
   
   // The menu items
   private JMenuItem newItem;
   private JMenuItem openItem;
   private JMenuItem saveItem;
   private JMenuItem saveAsItem;
   private JMenuItem exitItem;
   
   // The radio button menu items
   private JRadioButtonMenuItem monoItem;
   private JRadioButtonMenuItem serifItem;
   private JRadioButtonMenuItem sansSerifItem;
   
   // The checkbox menu items
   private JCheckBoxMenuItem italicItem;
   private JCheckBoxMenuItem boldItem;
   
   private String filename;     // To hold the file name
   private JTextArea editorText;// To display the text
   private final int NUM_LINES = 20;  // Lines to display
   private final int NUM_CHARS = 40;  // Chars per line

   /**
      Constructor
   */

   public TextEditor()
   {
      // Set the title.
      setTitle("Text Editor");

      // Specify what happens when the close
      // button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the text area.
      editorText = new JTextArea(NUM_LINES, NUM_CHARS);

      // Turn line wrapping on.
      editorText.setLineWrap(true);
      editorText.setWrapStyleWord(true);

      // Create a scroll pane and add the text area to it.
      JScrollPane scrollPane = new JScrollPane(editorText);

      // Add the scroll pane to the content pane.
      add(scrollPane);

      // Build the menu bar.
      buildMenuBar();

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildMenuBar method creates a menu bar and
      calls the createFileMenu method to create the
      file menu.
   */

   private void buildMenuBar()
   {
      // Build the file and font menus.
      buildFileMenu();
      buildFontMenu();

      // Create the menu bar.
      menuBar = new JMenuBar();

      // Add the file and font menus to the menu bar.
      menuBar.add(fileMenu);
      menuBar.add(fontMenu);

      // Set the menu bar for this frame.
      setJMenuBar(menuBar);
   }

   /**
      The buildFileMenu method creates the file menu
      and populates it with its menu items.
   */

   private void buildFileMenu()
   {
      // Create the New menu item.
      newItem = new JMenuItem("New");
      newItem.setMnemonic(KeyEvent.VK_N);
      newItem.addActionListener(new NewListener());

      // Create the Open menu item.
      openItem = new JMenuItem("Open");
      openItem.setMnemonic(KeyEvent.VK_O);
      openItem.addActionListener(new OpenListener());

      // Create the Save menu item.
      saveItem = new JMenuItem("Save");
      saveItem.setMnemonic(KeyEvent.VK_S);
      saveItem.addActionListener(new SaveListener());

      // Create the Save As menu item.
      saveAsItem = new JMenuItem("Save As");
      saveAsItem.setMnemonic(KeyEvent.VK_A);
      saveAsItem.addActionListener(new SaveListener());

      // Create the Exit menu item.
      exitItem = new JMenuItem("Exit");
      exitItem.setMnemonic(KeyEvent.VK_X);
      exitItem.addActionListener(new ExitListener());

      // Create a menu for the items we just created.
      fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);

      // Add the items and some separator bars to the menu.
      fileMenu.add(newItem);
      fileMenu.add(openItem);
      fileMenu.addSeparator();// Separator bar
      fileMenu.add(saveItem);
      fileMenu.add(saveAsItem);
      fileMenu.addSeparator();// Separator bar
      fileMenu.add(exitItem);
   }

   /**
      The buildFontMenu method creates the font menu
         and populates it with its menu items.
   */

   private void buildFontMenu()
   {
      // Create the Monospaced menu item.
      monoItem = new JRadioButtonMenuItem("Monospaced");
      monoItem.addActionListener(new FontListener());

      // Create the Serif menu item.
      serifItem = new JRadioButtonMenuItem("Serif");
      serifItem.addActionListener(new FontListener());

      // Create the SansSerif menu item.
      sansSerifItem =
              new JRadioButtonMenuItem("SansSerif", true);
      sansSerifItem.addActionListener(new FontListener());

      // Group the radio button menu items.
      ButtonGroup group = new ButtonGroup();
      group.add(monoItem);
      group.add(serifItem);
      group.add(sansSerifItem);

      // Create the Italic menu item.
      italicItem = new JCheckBoxMenuItem("Italic");
      italicItem.addActionListener(new FontListener());

      // Create the Bold menu item.
      boldItem = new JCheckBoxMenuItem("Bold");
      boldItem.addActionListener(new FontListener());

      // Create a menu for the items we just created.
      fontMenu = new JMenu("Font");
      fontMenu.setMnemonic(KeyEvent.VK_T);

      // Add the items and some separator bars to the menu.
      fontMenu.add(monoItem);
      fontMenu.add(serifItem);
      fontMenu.add(sansSerifItem);
      fontMenu.addSeparator();// Separator bar
      fontMenu.add(italicItem);
      fontMenu.add(boldItem);
   }

   /**
      Private inner class that handles the event that
      is generated when the user selects New from 
      the file menu.
   */

   private class NewListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         editorText.setText("");
         filename = null;
      }
   }

   /**
      Private inner class that handles the event that
      is generated when the user selects Open from
      the file menu.
   */

   private class OpenListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int chooserStatus;

         JFileChooser chooser = new JFileChooser();
         chooserStatus = chooser.showOpenDialog(null);
         if (chooserStatus == JFileChooser.APPROVE_OPTION)
         {
            // Get a reference to the selected file.
            File selectedFile = chooser.getSelectedFile();

            // Get the path of the selected file.
            filename = selectedFile.getPath();

            // Open the file.
            if (!openFile(filename))
            {
               JOptionPane.showMessageDialog(null, 
                                "Error reading " +
                                filename, "Error",
                                JOptionPane.ERROR_MESSAGE);
            }
         }
      }

      /**
         The openFile method opens the file specified by
         filename and reads its contents into the text
         area. The method returns true if the file was
         opened and read successfully, or false if an
         error occurred.
         @param filename The name of the file to open.
      */

      private boolean openFile(String filename)
      {
         boolean success;
         String inputLine, editorString = "";

         try
         {
            // Open the file.
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);
            
            // Read the file contents into the editor.
            while (inputFile.hasNext())
            {
               // Read a line from the file.
               inputLine = inputFile.nextLine();
               
               // Append it to the string to display
               // in the editor.
               editorString = editorString +
                              inputLine + "\n";
            }
            
            // Display the string that was read from the
            // file in the editor.
            editorText.setText(editorString);

            // Close the file.
            inputFile.close();  

            // Indicate that everything went OK.
            success = true;
         }
         catch (IOException e)
         {
            // Something went wrong.
            success = false;
         }

         // Return our status.
         return success;
      }
   }

   /**
      Private inner class that handles the event that
      is generated when the user selects Save or Save
      As from the file menu.
   */

   private class SaveListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         int chooserStatus;

         // If the user selected Save As, or the contents 
         // of the editor have not been saved, use a file
         // chooser to get the file name. Otherwise, save
         // the file under the current file name.

         if (e.getActionCommand() == "Save As" || 
             filename == null)
         {
            JFileChooser chooser = new JFileChooser();
            chooserStatus = chooser.showSaveDialog(null);
            if (chooserStatus == JFileChooser.APPROVE_OPTION)
            {
               // Get a reference to the selected file.
               File selectedFile =
                             chooser.getSelectedFile();

               // Get the path of the selected file.
               filename = selectedFile.getPath();
            }
         }

         // Save the file.
         if (!saveFile(filename))
         {
            JOptionPane.showMessageDialog(null,
                               "Error saving " +
                               filename, 
                               "Error",
                               JOptionPane.ERROR_MESSAGE);
         }
      }

      /**
         The saveFile method saves the contents of the
         text area to a file. The method returns true if
         the file was saved successfully, or false if an
         error occurred.
         @param filename The name of the file.
         @return true if successful, false otherwise.
      */

      private boolean saveFile(String filename)
      {
         boolean success;
         String editorString;
         PrintWriter outputFile;

         try
         {
            // Open the file.
            outputFile = new PrintWriter(filename);

            // Write the contents of the text area
            // to the file.
            editorString = editorText.getText();
            outputFile.print(editorString);

            // Close the file.
            outputFile.close();

            // Indicate that everything went OK.
            success = true;
         }
         catch (IOException e)
         {
            // Something went wrong.
             success = false;
         }

         // Return our status.
         return success;
      }
   }

   /**
      Private inner class that handles the event that
      is generated when the user selects Exit from
      the file menu.
   */

   private class ExitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }

   /**
      Private inner class that handles the event that
      is generated when the user selects an item from
      the font menu.
   */

   private class FontListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get the current font.
         Font textFont = editorText.getFont();

         // Retrieve the font name and size.
         String fontName = textFont.getName();
         int fontSize = textFont.getSize();

         // Start with plain style.
         int fontStyle = Font.PLAIN;

         // Determine which font is selected.
         if (monoItem.isSelected())
            fontName = "Monospaced";
         else if (serifItem.isSelected())
            fontName = "Serif";
         else if (sansSerifItem.isSelected())
            fontName = "SansSerif";

         // Determine whether italic is selected.
         if (italicItem.isSelected())
            fontStyle += Font.ITALIC;

         // Determine whether bold is selected.
         if (boldItem.isSelected())
            fontStyle += Font.BOLD;

         // Set the font as selected.
         editorText.setFont(new Font(fontName, 
                                fontStyle, fontSize));
      }
   }
   
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      TextEditor te = new TextEditor();
   }
}
