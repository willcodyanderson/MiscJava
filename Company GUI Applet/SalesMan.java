public class SalesMan extends Employee
{
   private String territory;
   private double goal;
   
   public SalesMan()
   {
      super("SalesName",1);
      goal = 2550.00;
      territory = new String("France");
   }
   public SalesMan(String name,int number, double goals,String terry)
   {
      super(name,number);
      goal = goals;
      territory = terry;
   }
   public String GetTerry()
   {
      return territory;
   }
    public String toString()
   {
      return "S" + super.toString() + "," + goal + "," + territory;
   }

   public double Getgoals()
   {
      return goal;
   }
   public void SetTerry(String terry)
   {
      territory = terry;
   }
   public void Setgoals(double goals)
   {
      goal = goals;
   }
 }