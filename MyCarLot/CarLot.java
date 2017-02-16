import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;
import java.lang.String;

/**
This is the class of the CarLot
@param class of CarLot.
*/
public class CarLot extends Car
{
      
   public CarLot()
   {

   }
/**
Method will allow the LinkedList to be displayed with the array of the lenght of the list.
@param Displays the array of the Carlist.
@return Prints the list out the the users screen.
*/
    public void Display(LinkedList Carlist)
   {
      Collections.sort(Carlist);
      for(int i = 0; i < Carlist.size(); i++)
      {
          System.out.println(Carlist.get(i));
      }
   }
/**
Method will Display the car form the vin number entered.
@param Carlist references the LinkedList which gets the info of the car from the
required info.
@return Returns the Print function of the Carlist with the info
asked for. 
*/
   public void GetCar(LinkedList Carlist)
   {
      System.out.println("Please Enter a Vin Number");
      int b;
      b = IO.readInt();
       for(int i = 0; i < Carlist.size(); i++)
      {
         if(b == ((Car) Carlist.get(i)).getVinNum())
         {
            System.out.println(Carlist.get(i));
         }
      }

   }
/**
Method will display the Car from the same cars that are same.
@param Carlist references the LinkedList which gets the cars that are same
from the cars list.
@return Returns the same car from the Carlist using the print fuction to 
display to the users screen. 
*/
   public void CarEqual(LinkedList Carlist)
   {
      for(int i = 0; i < Carlist.size()-1; i++)
         {
               if(((Car)Carlist.get(i)).compareTo((Car)Carlist.get(i+1)) == 0)
               {
                  System.out.println(" these are your two same models");
               }
         }
   }
/**
Method will display the totalcars from the car list using the values assigned to them.
@param Carlist references the LinkedList which gets the cars that have values and 
addes them all together.
@return Returns the total cars in the Carlist using a print fucntion after a for loop has found the
values of the cars.
*/
   public void totalCars(LinkedList Carlist)
   {
      int TotalVal = 0;
      
      for(int i = 0; i <Carlist.size(); i++)
      {
        TotalVal += ((Car)(Carlist.get(i))).getPrice();
      }
      System.out.println("The total value of all the cars is: " + TotalVal);
   }
/**
Method will display a mssage to delete a csr by its vin number of the car.
@param Carlist references the LinkedList which gets the car from the vin number
and deletes it.
@return Returns the list with the deleted car and shows them to the users screen.
*/
   public static void Cardelete(LinkedList Carlist)
   {
      int CarInfo;
      System.out.println("Enter the Vin Number of the Car to Delete");
      CarInfo = IO.readInt();
      for(int i = 0; i < Carlist.size(); i++)
      {
         if((((Car)Carlist.get(i)).getVinNum() == CarInfo))
           {
               Carlist.remove(i);
           }
      
      }
              
   }
   public static void addCar()
   {
      System.out.println("Error: Code not implemented");
   }
   public static void modifyCar()
   {
      System.out.println("Error: Code not implemented");
   }
/**
Method will display the list that was altered allowing it to be changed into a shallow clone.
@param Carlist references the LinkedList which gets the car form the list
duplicating them.
@return Returns the duplicated version of the Carslist that was altered after removing the car.
*/
   public void Shallowclone(LinkedList Carlist)
   {
      LinkedList Carlist2 = new LinkedList();
      Carlist2 = Carlist;
      Display(Carlist2);       
   }
/**
Method will display
*/
   public void deepclone(LinkedList Carlist)
   {
   LinkedList Carlist2 =(LinkedList)Carlist.clone();
   Display(Carlist2);   
   }
      

      
           
   
   
}