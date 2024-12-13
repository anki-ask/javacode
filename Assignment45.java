package Assignments;
import java.util.Scanner;
public class Assignment45 //Write a program to find out Circumference of rectangle using scanner class
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		float l,b;
		System.out.println("Enter the length of the rectangle:");
		l=s1.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		b=s1.nextFloat();
		double Circumference=2*(l+b);
		System.out.println("Circumference of the rectangle is:" +Circumference);
	}

}


