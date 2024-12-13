package Assignments;

import java.util.Scanner;

public class Assignment41//Write a program to find out area of  rectangle using scanner class 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		int l1=s1.nextInt();
		System.out.print("Enter the width of rectangle:");
		int b1=s1.nextInt();
		int Area_of_rectangle=l1*b1;
		System.out.println("Area of rectangle is:"+Area_of_rectangle);
	}

}
