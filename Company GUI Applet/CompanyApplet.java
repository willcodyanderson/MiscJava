/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: CompanyApplet.java
*/

/**
The class where the salesman is made. The methods include the getter and setters of territory, the sales target
and the tostring method.
*/
import java.io.*;
import java.util.*;
import javax.swing.*;	// JTextField, JPanel, JApplet, JLabel
import javax.swing.border.TitledBorder;
import java.awt.*;		// GridLayout, FlowLayout, BorderLayout
import java.awt.event.*;	// ActionListener
import java.text.DecimalFormat;

/**
The class that contains all the GUI elements of the company
*/

public class CompanyApplet extends JApplet 
{
   private JTextField name = new JTextField();//Creating Text fields
   private JTextField type = new JTextField();
   private JTextField num = new JTextField();
   private JTextField level = new JTextField();
   private JTextField terry = new JTextField();
   private JButton add = new JButton("ADD");//Creating The buttons
   private JButton delete = new JButton("DELETE");
   private JButton sort = new JButton("SORT");
   private JButton reset = new JButton("RESET");
   private JTextArea empdisplay;//Creating The list display
   JRadioButton radiosale = new JRadioButton("Salesman");//Creating Radios
   JRadioButton radiotech = new JRadioButton("Technician");
   LinkedList <Employee> emplist = new LinkedList<Employee>();//creating the list of employee objects
   JLabel labelnum = new JLabel();
   
   /**
   The constructor method.It builds the GUI 
   */
   public CompanyApplet(){
       
// The First Panel, Displaying all current employees information.
   JPanel p1 = new JPanel(new BorderLayout());
   p1.setBorder(new TitledBorder("List of Employees"));
//Creating a list to display mycompany array

   empdisplay = new JTextArea(5, 20);;
   empdisplay.setEditable(false);
    empdisplay.setLineWrap(true);
    empdisplay.setVisible(true);
    JScrollPane scroll = new JScrollPane (empdisplay);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
 
   p1.add(scroll);
   //The second panel, containing all the text fields to be filled out.
   JPanel p2 = new JPanel();
   p2.setBorder(new TitledBorder("Employee Information"));
   p2.setLayout (new GridLayout (5, 2));
   p2.add(new JLabel("Employee Territory/Department: "));
   p2.add(terry);
   p2.add(new JLabel("Employee Level/Sales Target: "));
   p2.add(level);
   p2.add(new JLabel("Employee Number: "));
   p2.add(num);
   p2.add(new JLabel("Employee Name: "));
   p2.add(name);
   p2.add(radiotech);//add radio buttons
   p2.add(radiosale);
   ButtonGroup group = new ButtonGroup();//group them
   group.add(radiotech);// add them
   group.add(radiosale);


   
   
// The Third Panel, that actually deals with all operations via buttons 
   JPanel p3 = new JPanel();
   p3.setBorder(new TitledBorder("Operation"));
   p3.setLayout (new GridLayout (1,5));
	p3.add(add);
   p3.add(delete);
   p3.add(sort);
   p3.add(reset);
   
		
//setting sizes and borders
      p1.setPreferredSize(new Dimension(200, 200));
      p2.setPreferredSize(new Dimension(150, 150));
      p3.setPreferredSize(new Dimension(50, 50));
      add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
      add(p3, BorderLayout.SOUTH);

      		
      add.addActionListener(new AddButtonListener());// making all the buttons listen
      delete.addActionListener(new DeleteButtonListener());
      sort.addActionListener(new SortButtonListener());
      reset.addActionListener(new ResetButtonListener());
      
}
   //Creating a new instance of CompanyApplet
   public void main(String[] args) //main method
	{
         CompanyApplet myCompany = new CompanyApplet(); 			
	}
   /**
   Below are all of the ActionListeners with their own classes.
   The AddButton Listener add a type of employee with the text field data dependant on the radio selected
   The DeleteButton Listener deletes an employee with the selected number in the pop out box
   The Reset Button Listener resets the array to it's original form
   The Sort Button Listener sorts the list by the employee number.
   */
   private class AddButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      if(radiotech.isSelected())//if technician selected
      {
      Technician tech = new Technician(name.getText(), Integer.parseInt(num.getText()), Integer.parseInt(level.getText()), terry.getText());
      Company.addEmployee(emplist, tech);
      Company.listdisplay(emplist, empdisplay);
      }
      else if(radiosale.isSelected())//if salesman selected
      {
      SalesMan sale = new SalesMan(name.getText(), Integer.parseInt(num.getText()), Double.parseDouble(level.getText()), terry.getText());
      Company.addEmployee(emplist, sale);
      Company.listdisplay(emplist, empdisplay);
      }
   }
      
   
   }
   
   private class DeleteButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //creates a pop out prompt
         String str = JOptionPane.showInputDialog(null,"Enter the List Number of the Employee you wish to Remove", "Delete",JOptionPane.PLAIN_MESSAGE);	
		   try
			{
			   Company.deleteEmployee(emplist,Integer.parseInt(str));
			}
         //if not a valid option, do this:
			catch(Exception ex)
         {
         JOptionPane.showMessageDialog(null,"Invalid Input: Enter a valid list number","Error",JOptionPane.WARNING_MESSAGE);	
         }
         Company.listdisplay(emplist, empdisplay);
      
      }
   
   }
   private class SortButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      Company.sortEmployee(emplist, empdisplay);//sort
      Company.listdisplay(emplist, empdisplay);//display
      } 
   
   }
   private class ResetButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      Company.resetEmployee(emplist);//reset to original form
      Company.listdisplay(emplist, empdisplay);//display
      }
   
   }
}
