package Assignments;//Write a program for single-level inheritance using a static method in the same class name in the single package explorer. 
class Parent
{
	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
}
public class Assignment48 extends Parent
{
	public static void main(String[] args) 
	{
		add();
	}

}
