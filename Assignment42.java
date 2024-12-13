package Assignments;

import java.util.Scanner;

public class Assignment42//Write a program to find out area of  Square using scanner class 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int side;
		System.out.println("Enter the side of the square:");
		side=s1.nextInt();
		int area=side*side;
		System.out.println("Area of square is:"+area);
	}
}
