package Assignments;
import java.util.Scanner;
public class Assignment37//Write a program to do Addition,Subtraction,Multiplication,and Division and Modulus using Scanner class with 2 variables
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=s1.nextInt();
		System.out.println("Enter the value of b: ");
		int b=s1.nextInt();		
		System.out.print("Addition:");
		System.out.println(a+b);
		System.out.print("Substraction:");
		System.out.println(a-b);
		System.out.print("Multiplication");
		System.out.println(a*b);
		System.out.print("Division:");
		System.out.println(a/b);
		System.out.print("Modulus:");
		System.out.println(a%b);
	}

}
