package Assignments;

public class Assignment21//Write a program to create a class consist of static , Non Static and constructor method and call each of them in a non parameterized way. 
{
	static void addition()
	{
		System.out.println("This is non-parameterized static method");
	}
	void substraction()
	{
		System.out.println("This is non-parameterized non static method");

	}
	Assignment21()
	{
		System.out.println("This is Constructor method");
	}

	public static void main(String[] args) 
	{
		addition();
		Assignment21 a1=new Assignment21();
		a1.substraction();
	}

}
