package Assignments;

public class Assignment16//Write a program to print only even numbers from 0 to 50 using FOR Loop 
{
	public static void main(String[] args) 
	{
		int i;
		int number=50;
		for(i=1;i<=number;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		}
	}
}
