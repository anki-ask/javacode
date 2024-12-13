package Assignments;//Write a program to create relationship between class and abstract class , abstract class and interface(Multi level inheritence)
interface addition1
{
	void add();
}
abstract class substraction implements addition1
{
	abstract void sub();
}
public class Assignment66 extends substraction
{
	int a=50;
	int b=20;
	int c;
	public static void main(String[] args) 
	{
		Assignment66 a1=new Assignment66();
		a1.add();
		a1.sub();
	}

	public void add() 
	{
		c=a+b;
		System.out.println("Addition: "+c);
	}

	void sub() 
	{
		c=a-b;
		System.out.println("Substraction: "+c);
	}
}
