public class Technician extends Employee
{
   private String Department;
   private int levels;
   
   public Technician()
   {
      super("TechName",2);
      levels = 1;
      Department = new String("null"); 
   }
   public Technician(String name,int number,int lvl, String Dept)
   {
      super(name,number);
      levels = lvl;
      Department = Dept;
   }
   public String toString()
   {
      return "T" + super.toString() + "," + levels + "," + Department;
   }
   public String GetDept()
   {
      return Department;
   }
   public void setDept(String Dept)
   {
      Department = Dept;
   }
   public double Getlevel()
   {
      return levels;
   }
   public void Setlevels(int lvl)
   {
      levels = lvl;
   }
}