package Assignments;//Write a program for single-level inheritance using a Non-static method in the same class name in the single package explorer.

class Parent1
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
}
public class Assignment49 extends Parent1
{

	public static void main(String[] args) 
	{
		Assignment49 a1=new Assignment49();
		a1.add();
	}

}
