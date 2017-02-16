
import java.util.LinkedList ;
import java.util.ListIterator;
import java.util.Scanner;

public class UseCarLot
{
   public static void main (String [] args)
   {
      Menu NewMenu = new Menu();
     // Car.Display(Carlist);
       CarLot CR = new CarLot();
      Car Car1 = new Car("Ford", "blue",1996,458674,10000);
      Car Car2 = new Car("Toyota","Red",2015,363467,25000);
      Car Car3 = new Car("Honda","Electric Blue",2016,324567,28000);
      Car Car4 = new Car("Audi","Grey",2016,157895,60000);
      LinkedList <Car> Carlist = new LinkedList<Car>();
      Carlist.add(Car1);
      Carlist.add(Car2);
      Carlist.add(Car3);
      Carlist.add(Car4);
      
      String Value = new String();
      do
      {
         NewMenu.menu();
         Scanner Chose = new Scanner(System.in);
         System.out.println("Please Enter an option");
         Value = Chose.nextLine();
         
         switch (Value)
         {
         case "1":
         {
         CR.Display(Carlist);
         break;
         }
         case "2":
         {
         CR.GetCar(Carlist);
         break;
         }
         case "3":
         {
         CR.CarEqual(Carlist);
         break;
         }
         case "4":
         {
         CR.Cardelete(Carlist);
         break;
         }
         case "5":
         {
         CR.totalCars(Carlist);
         System.out.println("");
         break;
         }
         case "6":
         {
         CR.Display(Carlist);
         break;
         }
         case "7":
         {
         CR.Shallowclone(Carlist);
         break;
         }
         case "8":
         {
         System.out.println("See You Next Time!");
         break;
         }
         case "1-8":
         {
         System.out.println("You are so stupid. It's actually insane.");
         }
         default:
         {
         System.out.println("Invalid Input. Please Enter An Option (1-8)");
         }
         break; 
         }    


         
      }
      while(Value !="8");
      System.out.println("Program Ended");   
}
}
