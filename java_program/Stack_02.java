//Q. Sort a stack using temporary stack and temporary variable.
//sort the elements of a stack in ascending order using only stack operation (no array ,no list).
// stack input --> 34, 3, 31, 98, 92, 23

import java.util.*;
public class Stack_02 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(34);
	    stack.push(3);
		stack.push(31);
		stack.push(98);
		stack.push(92);
		stack.push(23);
		System.out.println(stack);
		
		sort(stack);
		System.out.println("Output :"+stack);
	}
	static void sort(Stack <Integer>stack)
	{
		Stack<Integer> temp_stack = new Stack<Integer>();
		while(!stack.isEmpty())
		{
			int temp = stack.pop();
			while(!temp_stack.isEmpty()&& temp_stack.peek()>temp)
					{
				stack.push(temp_stack.pop());
			}
			temp_stack.push(temp);
		}
		while(!temp_stack.isEmpty())
		{
           stack.push(temp_stack.pop());
		}
	}
	}











