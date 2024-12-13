package Assignments;//Write a program for constructor inheritance- single level using a parameterized super calling statement with explicit invocation
class ParentClass
{
	ParentClass(int a)
	{
		System.out.println("Parent class constructor");
	}
}
public class Assignment55 extends ParentClass
{
		Assignment55()
		{
			super(23); // explicitly written to call parameterized parent class constructor
			System.out.println("Child class constructor");
		}
		public static void main(String[] args) 
		{
			new Assignment55();
		}
}
