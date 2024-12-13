package Assignments;
import java.util.Scanner;
public class Assignment44//Write a program to find out Circumference of circle using scanner class 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		float r;
		System.out.println("Enter the radius of the circle:");
		r=s1.nextInt();
		double Circumference=2*Math.PI*r;
		System.out.println("Circumference of the circle is:" +Circumference);
	}

}
