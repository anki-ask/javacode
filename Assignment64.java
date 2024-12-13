package Assignments;//Write a program which contains 1 abstract class, inside that abstrat class mention 2 abstract method, 1 concrete non static method, 1 concrete static method. override the non static methods(abstract menthods+non static concrete method) and call all the methods in main method to execute.
abstract class Program1
{
	abstract void add();
	abstract void sub();
	void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}
	
}
public class Assignment64 extends Program1 
{
	public static void main(String[] args) 
	{
		Assignment64 a1=new Assignment64();
		a1.add();
		a1.sub();
		a1.mul();
		div();
	}
	void add() 
	{
		System.out.println("Addition");
	}

	void sub() 
	{
		System.out.println("Substraction");
	}
}
