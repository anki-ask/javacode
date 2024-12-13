package Assignments;//Write a program for single-level inheritance using a static and Non-static method in the different class name in the single package explorer.
public class Assignment50 extends Assignment50_1
{
	static void add1()
	{
		System.out.println("Child static method");
	}
	void sub1()
	{
		System.out.println("Child non-static method");
	}
	public static void main(String[] args) 
	{
		Assignment50 a1=new Assignment50();
		add1();
		a1.sub1();
		add();
		a1.sub();
	}
}
