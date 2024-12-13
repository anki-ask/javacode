package Assignments;
import java.util.Scanner;
public class Assignment47 //Write a program to launch different browsers using Scanner class in switch Concept
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number to launch browser:");
		switch(s1.nextInt())
		{
		case 1:
			System.out.println("Firefox");
			break;
		case 2:
			System.out.println("Google chrome");
			break;
		case 3:
			System.out.println("Microsoft Edge");
			break;
		case 4:
			System.out.println("Opera browser");
			break;
			default:
				System.out.println("Mozilla");
		}
	}
}
