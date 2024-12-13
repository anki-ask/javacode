package Assignments;//Write a Program for hierarchical Level Inheritance
class Assignment52Parent
{
	static int a=10;
	static void add()
	{		
		System.out.println("Parent method");
	}
}
class Child extends Assignment52Parent
{
	static void sub()
	{
		int b=5;
		int c=a+b;
		System.out.println(c);
		System.out.println("Child1 method");
	}
}
public class Assignment52 extends Assignment52Parent
{
	static void mul()
	{
		System.out.println("Child2 method");
	}

	public static void main(String[] args) 
	{
		mul();
		add();
		Child c1=new Child();
		c1.sub();	
	}
}
