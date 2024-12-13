package Assignments;

public class Assignment22//Write a program on constructor Overloading 
{
	Assignment22()
	{
		System.out.println("Constructor");
	}
	Assignment22(int a)
	{
		System.out.println("Constructor overloading");

	}
	public static void main(String[] args) 
	{
		Assignment22 a1=new Assignment22();
		Assignment22 a2=new Assignment22(2);
	}
}
