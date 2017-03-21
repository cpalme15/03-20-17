
public class LinkedList
{


	private class Node
	{
		private char data;
		private Node link;
		public Node(char ltr,Node n)
		{
			data=ltr;
			link=n;
			/*
			 * head= new Node('A',head) puts it at the beginning
			 * as new head.
			 * temp.link=new node('E', null)put it at the end
			 */
		}


	}	
	private Node head;

	public LinkedList()
	{
		head =null;
	}
	public void addFirst(char c)
	{
		head=new Node(c,head);

	}
	public void addLast(char c)
	{
		
		if(head==null)
		{
			addFirst(c);
		}
		else
		{
			Node temp=head;
			while(temp.link!=null)
				temp=temp.link;
			
			temp.link=new Node(c,null);
		}
	}
	public void Remove(char c)
		{
			if(head==null)
				throw new RuntimeException("Empty List");
			Node temp=head;
			Node prev=head;
			if(head.data==c)
			{
				head=temp.link;
				temp.link=null;
				return;
			}
			while(temp!=null && temp.data!= c)
			{
				prev=temp;
				temp=temp.link;
			}
			if(temp==null)
				throw new RuntimeException(c+" not found");
		
			prev.link=temp.link;
			temp.link=null;
			
		}
	public void Display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.link;

		}
	}
}
