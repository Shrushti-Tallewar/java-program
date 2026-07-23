package java_program;


class Animal{
	Animal(){
		System.out.println("Animal Created");
	}
}

class Dog extends Animal{
	void display(){
	System.out.println("Dog Created");
}
}
public class program_1 {
	public static void main (String[]args) {
		Dog d = new Dog();
		d.display();
	}

}
