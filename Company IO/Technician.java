/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: Salesman.java
*/


/**
The class where the technician is made. The methods include the getter and setters of level, the department
and the tostring method.
*/

public class Technician extends Employee
{
   private String Department;
   private int level;
   
   public Technician()
   {
      super("NULL",0000);
      level = 1;
      Department = new String("null"); 
   }
   /**
   The default constructor. Arguements are name, number, level and department.
   */
   public Technician(String name,int number,int lvl, String Dept)
   {
      super(name,number);
      level = lvl;
      Department = Dept;
   }
   
   /**
   The method that converts the Technician details into a string
   @returns a string of technician details.
   */
   public String toString()
   {
      return super.toString() + "," + level + ", " + Department + "\n";
   }
   /**
   The method that gets the department of the technician
   @returns the department
   */
   public String GetDept()
   {
      return Department;
   }
   /**
   The method that gets the level of the technician
   @returns the level
   */
   public double Getlevel()
   {
      return level;
   }
   /**
   The method that sets the level of the technician
   */
   public void Setlevels(int lvl)
   {
      level = lvl;
   }
}