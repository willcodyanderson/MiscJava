import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.lang.Math;

public class UseRecords
{
   public static void main(String[] args)
/**
This generates the random numbers in each record. The records are then added to the array
myRecords for further use and computations.
*/
   {
        Records Records1 = new Records((int)(Math.random() * 21));
        Records Records2 = new Records((int)(Math.random() * 21));
        Records Records3 = new Records((int)(Math.random() * 21));
        Records Records4 = new Records((int)(Math.random() * 21));
        Records Records5 = new Records((int)(Math.random() * 21));
    
        Records[] myRecords = {Records1,Records2,Records3,Records4,Records5};
        
/**
Simply prints out the list of randomized values in records..
*/
        for( int i = 0 ; i < myRecords.length; i++)
        {
            System.out.print(myRecords[i]+ " ");
        }
            System.out.println("");
         
/**
Sorts through the records and arranges them in ascending numerical value in the array. 
*/
         Arrays.sort(myRecords);
         System.out.println("These are the records sorted:");
         for( int i = 0 ; i < myRecords.length; i++)
        {
            System.out.print(myRecords[i] + " ");
        }
/**
This transfers the record values in the records array into a linked list.
*/

         LinkedList newRecords = new LinkedList();
     
         for(int i = 0; i < myRecords.length; i++)
         {
          newRecords.add(myRecords[i]);
         }
         
/**
This will add each element of the list and add it to a variable called sum, which will then be
displayed to the user.
*/
         int Sum = 0;
         System.out.println(""); 
         
         for(int i = 0; i < myRecords.length; i++)
         {
            Sum = Sum+((Records)(newRecords.get(i))).Getter();
         }
         System.out.println("The sum of the records is: " + Sum);
         
/**
This goes through the list comparing elements, thus allowing to check if any are the same value.
*/
         for(int i = 0; i < 4; i++)
         {
               if(((Records)myRecords[i]).compareTo(myRecords[i+1])==0)
               {
                  System.out.println("These Records are the same: " + myRecords[i]);
               }
         }
        
    }    
    
     
     
}