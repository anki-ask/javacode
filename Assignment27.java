package Assignments;

public class Assignment27 // Write a program to create a class with 5 methods addition, subtraction, multiplication, division, modulus. Create 2 global variable a & b and perform the operation without involving 3rd variable.
{
	static int a=30;
	static int b=10;
	static void add()
	{
		System.out.print("Addition is:");
		System.out.println(a+b);
	}
	static void sub()
	{
		System.out.print("Substraction is:");
		System.out.println(a-b);
	}
	static void mul()
	{
		System.out.print("Multiplication is:");
		System.out.println(a*b);
	}
	static void div()
	{
		System.out.print("Division is:");
		System.out.println(a/b);
	}
	static void mod()
	{
		System.out.print("Modulus is:");
		System.out.println(a%b);
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}

}
