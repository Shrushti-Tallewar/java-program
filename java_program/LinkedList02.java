import java.util.*;
public class LinkedList02 {

	public static void main(String[] args) 
	{
		//Q1. Reverse a LinkedList
//		LinkedList <Integer> list = new LinkedList(Arrays.asList(1,2,3,4,5));
//		System.out.println("Input :"+ list);
//		
//		Collections.reverse(list);
//		System.out.println("Output :"+ list);

		
		//Q2. Find the middle element of the LinkedList
//		LinkedList<Integer>list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
//		int middle = list.size()/2;
//		System.out.println("Middle element : "+list.get(middle));
		
		//Q3. Remove duplicates from LinkedList
		LinkedList<Integer>list = new LinkedList<Integer>(Arrays.asList(10,20,30,40,50,40,30,20,10));
		System.out.println("Before removal:"+list);
		Set<Integer> set = new LinkedHashSet (list);
		list.clear();
		list.addAll(set);
		System.out.println("After removal :"+list);
	}
}
