import java.util.*;
public class LinkedList01 
{
	public static void main(String[] args) 
	{
		LinkedList <String> fruits = new LinkedList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.addFirst("Cherry");
		
		//System.out.println("fruits");
		for(String f : fruits)
		{
			System.out.println(f);
		}
	}
}
