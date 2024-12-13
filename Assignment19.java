package Assignments;

public class Assignment19//Write a program to call a Parameterized method using Non-Static Method 
{
	void add(int a,int b)
	{
		System.out.println("non static parameterized method");
	}
	public static void main(String[] args) 
	{
		Assignment19 a1=new Assignment19();
		a1.add(2, 3);
	}

}
