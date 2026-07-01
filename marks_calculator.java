package file2;

import java.util.Scanner;

public class marks_calculator {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String name;
	int[]marks = new int[5];
	int total = 0;
	int highest;
	int lowest;
	double average;
	
	System.out.println("Enter the student name:");
	name = sc.nextLine();
	for (int i = 0; i <5;i++){
		System.out.println("Marks for the "+i+" subject:");
	marks[i] = sc.nextInt();
	}
highest = marks[0];
lowest = marks[0];


for(int i= 0 ;i<5;i++) {
   total += marks[i];
   if (marks[i]>highest) {
	   highest = marks[i];}
   if (marks[i]< lowest) {
	   lowest =marks[i];
}}
 
   average= total/5;
   
   System.out.println("\n-------Student Report-------");
   System.out.println("Student Name :"+name);
   System.out.println("Total Marks:"+total);
   System.out.println("Average :"+average);
   System.out.println("Highest Marks:"+ highest);
   System.out.println("Lowest Marks:"+ lowest);
   
   sc.close();}}