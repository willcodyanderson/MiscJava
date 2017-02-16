/**
Name:William Anderson
Date:October 31th 2015
Course:CENG 212
File : Stacks and Queues
Teacher: Kenneth Baker
*/

import java.util.LinkedList ;
import java.util.ListIterator;


/** 
The class that will be used to operate StacksandQueues.It creates an instance of stacks and queues,
an array filled with the days of the week and two empty linked lists. It then calls methods from
StacksandQueues to load and display the linked lists in various ways.
*/
 public class UseStacksAndQueues 
 {
    public static void main(String[] args)
    {
      StacksAndQueues sQ = new StacksAndQueues();
      String [] days = {"mon","tue","wed","thur","fri", "sat","sun"};
      LinkedList aList = new LinkedList();
      LinkedList newList = new LinkedList();
      
      /**
      Calls the method that will load the array into a linked list
      @param passes the array containing the days of the week
      */
      aList = sQ.load(days);
      
      /**
      Calls the method that displays the linked list as it would be seen from the stack top down.
      @param passes the Linkedlist filled with the days of the week
      */
      sQ.stack(aList);
      System.out.println();
      
      /**
      Calls the method that displays the linked list in normal order as if in a queue
      @param passes the Linkedlist filled with the days of the week.
      */
      sQ.queue(aList);
      System.out.println();
      
      /**
      Method  displays the listIterator front to back, counting the entered spaces.
      @param passes the Linkedlist filled with the days of the week
      */
      sQ.ListIterator(aList);
      System.out.println();
      
      /**
      Method displays the listIterator back to front,counting the entered spaces.
      @param passes the Linkedlist filled with the days of the week
      */
      sQ.Traverse(aList);
      System.out.println(); 
       
      /**
      loads a string from the users keyboard and stores it into a linkedlist.
      */
      newList = sQ.GetInput();
      
      /**
      Sorts the linked list made from the string entered by the user.
      @param newList is the new linked list loaded with user input.
      */
      sQ.Sort(newList);
      
      /**
      Will allow the user to remove an element from the linked list and display the resulting linked list
      @param newList is the new linked list loaded with user input.
      */
      sQ.DisplayList(newList);      
    }
 }                 