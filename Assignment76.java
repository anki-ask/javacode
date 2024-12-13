package assignments1;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment76 //Write a program to create Array of size as 4 to store Int data type values at the run time
{
	public static void main(String[] args) 
	{
		int presentrollno[]=new int[4];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st rollno");
		presentrollno[0]=s1.nextInt();
		System.out.println("Enter 2nd rollno");
		presentrollno[1]=s1.nextInt();
		System.out.println("Enter 3rd rollno");
		presentrollno[2]=s1.nextInt();
		System.out.println("Enter 4th rollno");
		presentrollno[3]=s1.nextInt();
		System.out.println(Arrays.toString(presentrollno));
	}
}
