package Assignments;//Write a program for method overriding using super keyword
class Assignment58Parent
{
	void add()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
}
public class Assignment58 extends Assignment58Parent
{
	void add()
	{
		super.add();//super keyword
		int a=20;
		int b=20;
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public static void main(String[] args) 
	{
		Assignment58 a1=new Assignment58();
		a1.add();
	}
}
