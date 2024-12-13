package Assignments;
public class Assignment60 //Write a program to check which method access specifiers are accessable inside same class
{
	private void add()
	{
		System.out.println("Addition");
	}
	public void sub()
	{
		System.out.println("Substraction");
	}
	protected void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		Assignment60 a1=new Assignment60();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}
}
