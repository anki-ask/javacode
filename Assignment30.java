package Assignments;

public class Assignment30//Write a program on Thread Class Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int i;
		
		for(i=1;i<=10;i++)
		{
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}
