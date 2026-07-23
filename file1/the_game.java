package file1;

import java.util.Scanner;

public class the_game {
public static void main (String[]args)	{
Scanner sc = new Scanner(System.in);
	String secret_word = "Apple";

	System.out.println("====Welcome to the game=====");
	for (int attempts= 1;attempts <=3;attempts++) {
		System.out.println ("Guess the secret word");
		String word = sc.nextLine();
		
		if (word.equals( secret_word))
		{System.out.println("Congratualtions !,you won");
		break;
		}else {
		 if (attempts == 1) {
			System.out.println("Wrong!2 attempts left");	
		}
		else if(attempts == 2){
			System.out.println("Wrong!1 attempts left");}
		else {
			System.out.println("Game Over! The word was "+secret_word);
		}
		
	}
}
	sc.close();
}
}

