package Assignments; //Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation
class SuperParent
{
	SuperParent()
	{
		System.out.println("Super Parent Constructor");
	}
}
class Parent3 extends SuperParent
{
	Parent3(int a)
	{		
		System.out.println("Parent class constructor");
	}
}
public class Assignment56 extends Parent3
{
	Assignment56()
	{
		super(23); // explicitly written to call parameterized parent class constructor
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) 
	{
		new Assignment56();
	}
}
