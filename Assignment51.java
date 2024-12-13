package Assignments;//Write a Program for Multi Level Inheritance
class Assignment51Parent
{
	static void supermost()
	{
		System.out.println("Supermost class");
	}
}
class child2 extends Assignment51Parent
{
	static void super1()
	{
		System.out.println("Super class");
	}
}
public class Assignment51 extends child2
{
	static void sub()
	{
		System.out.println("Sub class");
	}
	public static void main(String[] args) 
	{
		sub();
		super1();
		supermost();
	}

}
