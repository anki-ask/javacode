package Assignments;
import java.util.Scanner;
public class Assignment43 //Write a program to find out Circumference of  triangle using scanner class
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of side a:");
		a=s1.nextInt();
		System.out.println("Enter the value of side b:");
		b=s1.nextInt();
		System.out.println("Enter the value of side c:");
		c=s1.nextInt();
		int Circumference=a+b+c;
		System.out.println("Circumference of the traingle is:" +Circumference);		
	}
}
