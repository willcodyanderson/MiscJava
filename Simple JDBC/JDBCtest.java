/*
 * 
 * William Anderson 
 * N01046945
 * April 12th, 2016
 * Teacher: Kenneth Baker
 */
import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import oracle.jdbc.*;
import oracle.jdbc.pool.OracleDataSource;
import javax.swing.border.TitledBorder;
import java.awt.*;		// GridLayout, FlowLayout, BorderLayout
import java.awt.event.*;	// ActionListener
import java.text.DecimalFormat;

/** The main class that creates an instance of the JFrame
 * 
 * @author William
 */
public class JDBCtest
{
       public static void main(String[] args) //main method
	{
        new JDBC();
	}
}
 class  JDBC
{
   //declaring components
   private JFrame frame = new JFrame();
   private JTextField sectionnum = new JTextField();
   private JTextField coursenum = new JTextField();
   private JButton search = new JButton("SEARCH");
   private JButton search2 = new JButton("SEARCH");
   private JTextArea datadisplay;
   private JTextArea datadisplay2;
  /** The method that creates the frame display
   * 
   */
   public JDBC()
   {
        
    JPanel p1 = new JPanel(new GridLayout(3,1)); //Create top Panel
    JPanel p2 = new JPanel(new GridLayout(3,1)); // Create Bottom PAnel
    //p1.setPreferredSize(new Dimension(200, 200));
    //p2.setPreferredSize(new Dimension(200, 200));
    p1.setBorder(new TitledBorder("Results:"));
    p2.setBorder(new TitledBorder("Section Number: "));
    datadisplay = new JTextArea(5, 20);;
    datadisplay.setEditable(false); //can't edit display
    datadisplay2 = new JTextArea(5, 20);;
    datadisplay2.setEditable(false); //can't edit display
    p1.add(datadisplay); //adding my components
    p1.add(sectionnum);
    p1.add(search);
    p2.add(datadisplay2);
    p2.add(coursenum);
    p2.add(search2);;
    // p1.setPreferredSize(new Dimension(200, 200));
    // p2.setPreferredSize(new Dimension(200, 200));
    
    frame.add(p1, BorderLayout.NORTH);
    frame.add(p2, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
    
     
    search.addActionListener(new SearchButtonListener()); // make it listen
    search2.addActionListener(new Search2ButtonListener());


    }
   /** What happens when the search button is pressed
    * 
    */
   
       private class SearchButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          try {
      // Load the JDBC driver 
      Class.forName("oracle.jdbc.OracleConnection");
    } 
    catch (ClassNotFoundException f){ 
    }
    // Enter user name and password
    String user = "n01046945";
    String passwd = "oracle";
    try {
      Connection conn = DriverManager.getConnection
         ("jdbc:oracle:thin:@munro.humber.ca:1521:msit" , user, passwd); 
      // 2. Create a statement
      Statement stmt = conn.createStatement(); //Factory method
      // 3. Create a result set  AND  4. Execute the query statement
      ResultSet rset = stmt.executeQuery("SELECT course_no, description, student_id, last_name, first_name\n" +
        "from course join section \n" +
        "using (course_no)\n" +
        "join enrollment\n" +
        "using (section_id)\n" +
        "join student\n" +
        "using (student_id)\n" +
        "WHERE section_no = " + Integer.parseInt(sectionnum.getText()));
      // 5. Iterate through the result and print the instructor table
      datadisplay.setText(""); //reset the display
      datadisplay.append("course_no, course_name, student_id, student_last, student_first \n\n"); // make labels
      while(rset.next())
         datadisplay.append(rset.getString("course_no") + ", " +
           rset.getString(2) +", "+ rset.getString(3) +", "+ rset.getString(4) + "\n");
      // 6. Close statement
      stmt.close();
    }
    catch (SQLException f){ 
      System.out.println("Could not make Oracle connection"); 
           }
      //Integer.parseInt(sectionnum.getText());
    } 
   
   }
   
      private class Search2ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      try {
      // Load the JDBC driver 
      Class.forName("oracle.jdbc.OracleConnection");
    } 
    catch (ClassNotFoundException f){ 
    }
    // Enter user name and password
    String user = "n01046945";
    String passwd = "oracle";
    try {
      Connection conn = DriverManager.getConnection
         ("jdbc:oracle:thin:@munro.humber.ca:1521:msit" , user, passwd); 
      // 2. Create a statement
      Statement stmt = conn.createStatement(); //Factory method
      // 3. Create a result set  AND  4. Execute the query statement
      ResultSet rset = stmt.executeQuery("SELECT course_no, description, section_no \n" +
"from course join section\n" +
"using (course_no)\n" +
"WHERE course_no = " + Integer.parseInt(coursenum.getText()));
      // 5. Iterate through the result and print the instructor table
      datadisplay2.setText(""); //reset the display
      datadisplay2.append("sec_no, course_no, Description \n\n"); // make labels
      while(rset.next())
         datadisplay2.append(rset.getString("course_no") + ", " +
           rset.getString(2) +", "+ rset.getString(3) +", "+ rset.getString(4) + "\n");
      datadisplay2.append("Hello");
      // 6. Close statement
      stmt.close();
    }
    catch (SQLException f){ 
      System.out.println("Could not make Oracle connection"); 
           }
      //Integer.parseInt(sectionnum.getText());
      } 
      } 
   
  
}