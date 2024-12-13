package Assignments;
public class Assignment59//Write a program where the non static global variable data type used are same as local variable. Use non static method to use the local variable in method. Use this key word to update the global variable value same as local variable.
{
	int a=60;
	void add()
	{
		int a=40;
		int b=20;
		int c=a+b;
		System.out.println("Addition with local variable:"+c);
		this.a=a;
	}
	public static void main(String[] args) 
	{
		Assignment59 a1=new Assignment59();
		System.out.println(a1.a);
		a1.add();
		System.out.println(a1.a);
	}
}
