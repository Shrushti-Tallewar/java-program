package java_program;
class Shape {
	Shape(){
		System.out.println("Shape Constructed");
	}
}
class Rectangle extends Shape{
	Rectangle(){
		System.out.println("Rectangle Constructor");
	}
}
public class program_3 {
	public static void main (String[]args) {
		Rectangle r = new Rectangle();
		
	}
}
