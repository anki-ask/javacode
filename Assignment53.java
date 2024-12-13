package Assignments;//Write a program for constructor inheritance using the super calling statement with Implicit Invocation
class Assignment53Parent
{
	Assignment53Parent()
	{
		System.out.println("Parent class constructor");
	}
}
public class Assignment53 extends Assignment53Parent
{
	Assignment53()
	{
		//super();
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) 
	{
		Assignment53 a1=new Assignment53();
	}
}
