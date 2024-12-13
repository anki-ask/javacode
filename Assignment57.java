package Assignments;

public class Assignment57 //Write a Program on This Calling Statement
{
	Assignment57()
	{
		this(55);
		System.out.println("Constructor 1");
	}
	Assignment57(int a)
	{
		System.out.println("Constructor 2");
	}

	public static void main(String[] args) 
	{
		new Assignment57();
	}
}


