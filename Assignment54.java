package Assignments;//Write a program for constructor - single level inheritance using a non-parameterized super calling statement with explicit invocation
class Assignment54Parent
{
	Assignment54Parent()
	{
		System.out.println("Parent class constructor");
	}

public static class Assignment54 extends Assignment54Parent
{
	Assignment54()
	{
		super();
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) 
	{
		Assignment54 a1=new Assignment54();
	}
}
}

