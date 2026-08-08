//Q. Uses Floyed's Algoritnm to detect and remove the cycle.
class Node_1
{
	int data;
	Node_1 next;
	
	Node_1(int data)
	{
		this.data = data;
	}
}
public class LinkedList04 
{
	public static void main(String[] args) 
	{
     Node_1 head = new Node_1(10);
     head.next = new Node_1(20);
     head.next.next = new Node_1(30);
     head.next.next.next = new Node_1(40);
     head.next.next.next.next = new Node_1(50);
     
     head.next.next.next.next.next = head.next;
     
     //print(head); 
     
     boolean hasCycle = detectCycle(head);
     System.out.println("Is cycle detected or not ? :"+hasCycle);
     print(head);
	}
static boolean detectCycle(Node_1 head)
{
	Node_1 slow = head;
	Node_1 fast = head;
	
	while(fast != null && fast.next!= null)
	{
		slow = slow.next;
		fast = fast.next.next;
		
		if(slow == fast)
		{
			removeCycle(head,slow);
			return true;
		}
	} return false;
}
static void removeCycle(Node_1 head, Node_1 meetingPoint)
{
	Node_1  start = head;
	while(head.next!= meetingPoint.next)
	{
		head = head.next;
		meetingPoint=meetingPoint.next;
	}
	meetingPoint.next = null;
}
static void print(Node_1 head)
{
	Node_1 current = head;
	while(current != null)
	{
		System.out.println(current.data);
		current =current.next;
	}
}
}
