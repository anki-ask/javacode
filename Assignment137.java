package assignment2;
public class Assignment137 //Write a program with exception handling using one catch block
{
	public static void main(String[] args) 
	{
		try
		{
			int[] myNumbers = {1, 2, 3};
		    System.out.println(myNumbers[5]);
		}
		catch(ArrayIndexOutOfBoundsException m1)
		{
			System.out.println("Sorry there is a problem.");
		}
	}
}
