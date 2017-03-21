
public class Main 
{

	public static void main(String[] args) 
	{
			/*
			 * data structures:
			 * 
			 * 
			 * Array: problems with array: limited size, 
			 * has to use sequential search to find something 
			 * in array.
			 * ArrayList:problems: shrink and size which 
			 * takes time when inserting.
			 * Linked List: Problems: have to use sequential
			 * search since they're all linked.
			 * Stack: problems: had to remove ones above it.
			 * Queue: has two ends problem: takes time to reach
			 * middle.
			 * Tree: splits things up so you can cut time in
			 * half.
			 * Set & Map: put them all a place and sort them
			 * and use a key.problem: requires lots of sorting.
			 * Hash: problem is same location because adds all numbers 
			 * up together.
			 * Graph: trys to find shortest path. Like in 
			 * picking flights finds least amount of layover
			 * and distance between to places with no direct
			 * flight.
			 * each "trainer car  " in a linked list is a node. 
			 * each node includes data and a  reference to another node
			 * the last node references null.
			 * head is the pointer to the first node.
			 * head.data is the data in the first node.
			 * head.link is link between head node and next node.
			 * head.link.data is link to next node after head node.
			 * head=head.link means it moves to head to the start of 
			 * the next link in  the chain but you cant move backwards
			 * temp=head and temp.link is the way to move down chain 
			 * without moving the head.
			 * while(temp!=null)
			 * {
			 * 	temp=temp.link
			 * }
			 * This is traversing 
			 * solves both the search and display by using display data
			 * for each node.
			 * Inserting nodes: 
			 *nu.link=temp.link
			 *temp.link=nu;
			 *deleting node:
			 *head.link=temp.link
			 *tmp.link=null;
			 *if want to remove t in cats find which one is t and stop
			 *link before it.
			 *prev and current are two pointers;
			 *prev.link=curr.link
			 *curr.link =null;
			 */

		LinkedList ll=new LinkedList();
		ll.addFirst('S');
		ll.addLast('I');
		ll.addFirst('T');
		ll.addFirst('A');
		ll.addFirst('C');
		ll.addLast('E');
		ll.Display();
		ll.Remove('I');
		System.out.println();
		ll.Display();
		ll.Remove('C');
		System.out.println();
		ll.Display();
		
	}

}
