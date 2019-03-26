/*
Class Name: Linked List: Handles data of type <T> associated with the Student and GradeItem
Author(s):
   @Anthony Irwin
   @Matt Hurt
Project 4
Developement Environment: Windows 10, jGRASP
Word: Pandemonium: Wild and noisy disorder, uproar and confusion
*/

public classs LinkedList<T> implements MyCollectionInterfaceProject04<T>
{
      private <T> Node head;       // first node in the linked list
      private <T> Node tail;       // last node in the list
   	private int numberOfEntries; // Total count of entries in linked list
      
      public LinkedList () {  // clears the list
         clear();
      } // end default constructor
      
      public void clear () {  // sets head and tail to null to clear list
         head = null;         // not pointing to anything
         tail = null;         // not pointing to anything
         numberOfEntries = 0; // 
      } // end clear
     
      // adds a new entry to this collection
   	public boolean add(T newPosition, T newEntry) {
   		//boolean result = false;
   		boolean isSuccessful = true;
         //Node newNode = new Node(newItem);
   		//newNode.next = firstNode;
   		//firstNode = newNode;
   		
   		//if (firstNode.equals(newNode)) {
         if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            Node newNode = new Node(newEntry);
               if (isEmpty()) {  // Considers if chain is empty
                  head = newNode;
                  tail = newNode;
               }
               else if (newPosition == 1){   // Considers adding a node at the chain's beginning
                  newNode.setNextNode(head);
                  head = newNode;
               }
         
         }
   			//result = true;
   			//numberOfEntries ++;  
   		}
   
   		//return result;
   	}
}
