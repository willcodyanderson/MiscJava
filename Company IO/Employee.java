/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: Employee.java
*/



import java.io.*;
public class Employee implements Comparable,Serializable 
{
   private int i;
	private String name;			// Variable to hold the employee name
   
	private int number;			// Variable to hold the employee number
	
	/**
	* Constructor  to create the superclass
	* @param has the employee name and number as arguements.
	*/
	public Employee(String namea, int numbera )
	{
		name = namea;
		this.number = numbera;
	}
   public String GetName()//Gets the name of the employee
   {
      return name;
   }
   public int GetNumber()// gets the number of the employee
   {
      return number;
   }
	public void SetName(String name)//Sets the name of the employee
   {
      this.name = name;
   }
   public void SetNumber(int number)//Sets the number of the employee
   {
      this.number = number;
   }


	/**
	* The compare to method. Returns a 0 if the two compared things are equal.
	* @param Has an employee object as an arguement
	* @returns a integer to show the reult of the comparison
	*/   
	public int compareTo(Object o)
	{
     if(GetNumber() > ((Employee)o).GetNumber())
			return 1;	
		else if  (GetNumber() < ((Employee)o).GetNumber())
			return -1;	// less than
		else
			return 0;	//equal
 	}
	
	/** The method that makes a string of the employee details.
   @returns the details in a string.
   */
	public String toString()
	{
      return super.toString()+" Name: " + name + " Number: " + number;       
	}
}