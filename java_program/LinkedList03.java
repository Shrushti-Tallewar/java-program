//Creating a custom (Manually) LinkedList

//This class represents on element of the LinkedList
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
class LinkedList
{ 
	Node head ;
	void add(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newNode;
		}
	}
		void printList()
		{
			Node current = head;
			while(current != null)
			{
				System.out.println(current.data);
				current = current.next;
			
		}
	}
}
public class LinkedList03 {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.printList();
	}

}

