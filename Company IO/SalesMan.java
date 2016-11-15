/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: Salesman.java
*/

/**
The class where the salesman is made. The methods include the getter and setters of territory, the sales target
and the tostring method.
*/
public class SalesMan extends Employee
{
   private String territory;
   private double target;
   private int number;
   private String name = new String();
   
   /**
   The no-arg constructor
   */
   public SalesMan()
   {
      super("William",00000);
      target = 4000.00;
      territory = new String("Canada");
   }
   /**
   The constructor. Arguements are name, number, level and department.
   */
   public SalesMan(String name,int number, double targeta,String territorya)
   {
      super(name,number);
      target = targeta;
      territory = territorya;
   }
   /**
   The method that gets the territory of the salesman
   @returns the territory
   */
   public String GetTerritory()
   {
      return territory;
   }
    /**
   The method that gets the target of the salesman
   @returns the target
   */
   public double GetTarget()
   {
      return target;
   }
   /**
   The method that sets the territory of the salesman
   */
   public void SetTerritory(String terri)
   {
      territory = terri;
   }
       /**
   The method that sets the target of the salesman
   */
   public void SetTarget(double targeta)
   {
      target = targeta;
   }
   /**
   The method that converts the Technician details into a string
   @returns a string of technician details.
   */
   public String toString()
   {
      return super.toString()+ "Name: " + name + " Number: " + number + " Target: " + target + " Territory: " + territory; 
   }
   public static void main(String []args)
   {
   }
}