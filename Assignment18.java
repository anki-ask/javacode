package Assignments;

public class Assignment18//Write a program to create a Non-Static Method 
{
	void add()
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void main(String[] args) 
	{
		Assignment18 a1=new Assignment18();
		a1.add();	
	}
}
