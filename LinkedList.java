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
      private Node firstNode;      // first node in the linked list
   	private int numberOfEntries; // Total count of entries in linked list
   								 
   	
   	LinkedList () // constructor
      {
   		initializeDataFields();
   	}
      
      // adds a new entry to this collection
   	public boolean add(T newItem) {
   		boolean result = false;
   		Node newNode = new Node(newItem);
   		newNode.next = firstNode;
   		firstNode = newNode;
   		
   		if (firstNode.equals(newNode)) {
   			result = true;
   			numberOfEntries ++;  
   		}
   
   		return result;
   	}
}
