package Assignments;

public class Assignment33//Write a program to print the value from 1 to 8, but skip the value when a equals  
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=8;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
