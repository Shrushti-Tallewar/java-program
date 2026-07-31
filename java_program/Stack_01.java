import java.util.*;
public class Stack_01 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Is stack empty? " +stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Our stack data : "+ stack);
		System.out.println("Top element:"+stack.peek());
		System.out.println("Deleted element:"+stack.pop());
		System.out.println("Our stack data : "+ stack);
		System.out.println("Is stack empty? " +stack.isEmpty());
	}

}




























