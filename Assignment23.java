package Assignments;

public class Assignment23//Write a program on method Overloading  
{
	static void add()
	{
		System.out.println("1st method with same name");
	}
	void add(int a,int b)
	{
		System.out.println("2nd method with same name");
	}
	public static void main(String[] args) 
	{
		add();
		Assignment23 a1=new Assignment23();
		a1.add(2, 2);
	}
}
