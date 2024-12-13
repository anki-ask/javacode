package Assignments;

public class Assignment26 //Write a program to update value of local and static global variable and non static global variable
{
	static int a=10;//static global variable
	int b=12;//non static global variable

	public static void main(String[] args) 
	{
		int c=15;//local variable
		c=16; //updated local variable
		a=20; //updated static global variable
		Assignment26 a1=new Assignment26();
		a1.b=13; //updated non static global variable
		System.out.println(a+a1.b+c);
	}
}
