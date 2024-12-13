package Assignments;
import java.util.Scanner;

public class Assignment40//Write a program to find out area of  Circle using scanner class 
{	
		public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the radius of circle:");
			float radius=s1.nextFloat();
			double Area_of_circle=Math.PI*radius*radius;
			System.out.println("Area of triangle is:" +Area_of_circle);
		}

	}

