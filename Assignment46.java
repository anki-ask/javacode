package Assignments;

import java.util.Scanner;

public class Assignment46//Write a program to find out Circumference of Square using scanner class 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		float a;
		System.out.println("Enter the side of the square:");
		a=s1.nextFloat();
		double Circumference=4*a;
		System.out.println("Circumference of the square is:" +Circumference);
	}

}
