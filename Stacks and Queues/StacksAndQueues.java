
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;
import java.lang.String;


public class StacksAndQueues
{
/** The method that loads the array of days into the linked list.
@ param returns the newly loaded linked list, takes an array of Strings.
*/
   public LinkedList load(String[] array)
   {
      LinkedList list = new LinkedList();
     
     for(int i = 0; i < array.length; i++)
     {
       list.add(array[i]);
     } 
     return list;
   }
/** The method that displays the linkedlist as if read from a stack (in reverse) simply
decrementing until index 0 is the last displayed.
@param alist is passed, no return values 
*/
   public void stack(LinkedList alist)
   {
      System.out.println("The list displayed as a stack:");
      for(int i = 6; i >= 0; i--)
      {
         System.out.print(alist.get(i) + " ");
      }
      System.out.println("");
   }
/** The method that displays the linked list from index 0 to the end, as if it were in a queue.
@param alist is passed, no return values
*/
   public void queue(LinkedList alist)
   {
      System.out.println("The list displayed as a queue:");
      for(int i = 0; i <= 6; i ++)
      {
         System.out.print(alist.get(i) + " ");
      } 
      System.out.println("");
   }
/** The method that display the listIterator after using Iterator methods to observe whether or not
the list has a next element, thus allowing the list to know when to stop displaying.
@param passes a linked list mylist, no return value.
*/  
   public void ListIterator(LinkedList myList)
   {
      System.out.println("The list displayed as a queue via an Iterator:");
    ListIterator myIterator = myList.listIterator();
    while( myIterator.hasNext() )//checks if there is a next value
      System.out.print(myIterator.next()+"  " );
    System.out.println("");
   } 
/** The method that display the listIterator after using Iterator methods to observe whether or not
the list has a previous element, thus allowing the list to know when to stop displaying from back to 
front.
@param passes a linked list mylist, no return value.
*/  
   public void Traverse(LinkedList myList)
   {
      System.out.println("The list displayed as a stack via an Iterator:");
       ListIterator myIterator = myList.listIterator(myList.size());
       while( myIterator.hasPrevious() )//checks for a previous value
         System.out.print(myIterator.previous()+"  " );
       System.out.println("");
   }
   
/** The method that loads a string from the user and breaks it into a linked list.
@param nothing passed, returns a linked list
*/
   public LinkedList GetInput()
   {
      
      Scanner Keyboard = new Scanner(System.in);
      System.out.println("Enter Characters");
      String myString = Keyboard.nextLine();
      String[] Sent = myString.split(" ");// splits the entered string at spaces
      load(Sent);
      System.out.println(load(Sent));
      return load(Sent);
   }
/** The method that uses a pre-existing sort method from Collections to sort the user input list
@param passes a linked list, no return value
*/    
   public void Sort(LinkedList mylist3)
   {
      Collections.sort(mylist3);
      System.out.println(mylist3);
       
   }
/** The method that displays the users linked list, then gives them the option to remove an element.
After the element is removed, it displays the new list.
@param passes a linked list, no return value.
*/   
   public void DisplayList(LinkedList Removed)
   {
    String input;
    System.out.println("Please Enter Any Character you wish to remove:");
    Scanner sc = new Scanner(System.in);
    input = sc.nextLine();
    Removed.remove(input);//removes the specified element
    int i; 
      for(i = 0; i < Removed.size(); i++)
      {
         System.out.print(Removed.get(i) + " ");
      } 
   }
   
       
}