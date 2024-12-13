package Assignments;

public class Assignment24 //Write a program on method Overloading with 5 static method and 5 non static method
{
	static void add()
	{
		System.out.println("This is 1st static method");
	}
	static void add(int a)
	{
		System.out.println("This is 2nd static method");
	}
	static void add(float b)
	{
		System.out.println("This is 3rd static method");
	}
	static void add(double c)
	{
		System.out.println("This is 4th static method");
	}
	static void add(int a,int b)
	{
		System.out.println("This is 5th static method");
	}
	void sub()
	{
		System.out.println("This is 1st Non static method");
	}
	void sub(int a)
	{
		System.out.println("This is 2nd Non static method");
	}
	void sub(int a,int b)
	{
		System.out.println("This is 3rd Non static method");
	}
	void sub(float a)
	{
		System.out.println("This is 4th Non static method");
	}
	void sub(double a)
	{
		System.out.println("This is 5th Non static method");
	}
	public static void main(String[] args) 
	{
		add();
		add(2);
		add(2.1f);
		add(2.18);
		add(3,2);
		System.out.println("-----------------------------------------------");
		Assignment24 a1=new Assignment24();
		a1.sub();
		a1.sub(3);
		a1.sub(7, 9);
		a1.sub(6.3f);
		a1.sub(34.2);
	}
}
