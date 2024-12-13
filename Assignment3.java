package Assignments;

public class Assignment3//Write a program to create a static method along with a main method that performs addition, subtraction, multiplication, and division. 
{
	static void add()
	{
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	static void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Substraction:"+c);
	}
	static void mul()
	{
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("Multiplication:"+c);
	}
	static void div()
	{
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("Division:"+c);
	}
	static void modulus()
	{
		int a=20;
		int b=10;
		int c=a%b;
		System.out.println("Modulus:"+c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		modulus();
	}

}
