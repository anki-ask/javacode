package Assignments;
import java.util.Scanner;
public class Assignment39//Write a program to find out area of  triangle using scanner class
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of Base:");
		int Base=s1.nextInt();
		System.out.println("Enter the value of Height:");
		int Height=s1.nextInt();
		double Area_of_triangle=0.5*Base*Height;
		System.out.println("Area of triangle is:" +Area_of_triangle);
	}
}
