package Assignments;//Write a program to create relationship between class and interface
interface addition
{
	void add();
}
public class Assignment65 implements addition
{
	public static void main(String[] args) 
	{
		Assignment65 a1=new Assignment65();
		a1.add();
	}
	public void add() 
	{
		int a=10,b=10,c;
		c=a+b;
		System.out.println("Addition: "+c);	
	}
}
