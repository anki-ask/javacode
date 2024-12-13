package Assignments;

public class Assignment10//Write a program on Nested if else block 
{
	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=5;
		if(a>b)
		{
			System.out.println("if block executed");
		}
		else if(a==b)
		{
			System.out.println("second if block is executed");
		}
		else if(a<c)
		{
			System.out.println("third if block is executed");
		}
		else if(a<b)
		{
			System.out.println("fourth if block is executed");
		}
	}
}