/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: Salesman.java
*/
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
The class containing all of the buisness logic for the Applet
*/
public class Company 
{
  static Employee[] mycompany = new Employee[8];
   
   /**
   Initializing the data
   */
   public static void initialize(LinkedList emplist)
   {
   mycompany[0] = new Technician("Baker",23,4,"Teacher of Woe");
   mycompany[1] = new Technician("Cody",25,4,"Godness");
   mycompany[2] = new Technician("Sanjay",26,4,"Mage");
   mycompany[3] = new Technician("Bobby",23,4,"Depart1"); 
   mycompany[4] = new Technician("Bobby",23,4,"Depart1");
   mycompany[5] = new Technician("Jones",93,2,"Depart2");
   mycompany[6] = new SalesMan("Ernie",45,5642.00,"Territory1");
   mycompany[7] = new SalesMan("brook",43,3254.00,"territory2");
   //adding the data to a linked list
  int j=0;
  for (j=0;j<mycompany.length;j++)
  {
      emplist.add(mycompany[j]);
  } 
  }
   /**
   The method that adds an employee to the list
   @param it takes the employee object passed to it and the linked list
   */
   public static void addEmployee(LinkedList category, Employee emp)
	{
   category.add((Object)emp);  		
	}
   /**
   The method that deletes an employee from the list
   @param it takes an integer passed to it and the linked list
   */
   public static void deleteEmployee(LinkedList category3, int a)throws Exception
	{
        category3.remove(a-1);     				         
	}
   /**
   The method that sorts the  employees in the list
   @param it takes the textarea passed to it and the linked list
   */           
   public static void sortEmployee(LinkedList emplist, JTextArea empdisplay)
	{
       Collections.sort(emplist);        
	}

   /**
   The method that displays the  employees in the list
   @param it takes the textarea passed to it and the linked list
   */ 
   public static void listdisplay(LinkedList category, JTextArea jta)
	{
      jta.setText("");
  	   int i = 0;  	
		for(i = 0; i < category.size(); i = i + 1)
    	{
        	jta.append((i+1)+".  "+((Employee)category.get(i)).toString() + "\n"); 
    	}                                                                   
	}  
      
   /**
   The method that returns the list to it's initialized contents
   @param it takes the linked list
   */       
   public static void resetEmployee(LinkedList emplist)
   {
   emplist.clear();
   mycompany[0] = new Technician("Baker",23,4,"Teacher of Woe");
   mycompany[1] = new Technician("Cody",25,4,"Godness");
   mycompany[2] = new Technician("Sanjay",26,4,"Mage");
   mycompany[3] = new Technician("Bobby",23,4,"Depart1"); 
   mycompany[4] = new Technician("Bobby",23,4,"Depart1");
   mycompany[5] = new Technician("Jones",93,2,"Depart2");
   mycompany[6] = new SalesMan("Ernie",45,5642.00,"Territory1");
   mycompany[7] = new SalesMan("brook",43,3254.00,"territory2");
 
  int j=0;
  for (j=0;j<mycompany.length;j++)
  {
      emplist.add(mycompany[j]);
  } 
  }
  //constructor 
   public void Company()
   {
    
    mycompany[0] = new Technician();
    mycompany[2] = new Technician("Bobby",23,4,"Field Service");
    mycompany[3] = new Technician("Jones",93,2,"Repairs");
    mycompany[1] = new SalesMan("Billy",84,3000.00,"France");
    mycompany[4] = new SalesMan("Ernie",45,5642.00,"England");
    mycompany[5] = new SalesMan("brook",43,3254.00,"New Zealand");
   }
      

}