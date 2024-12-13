package Assignments;//Write a program to check if the given String is Palindrome or not
public class Assignment70 
{
	public static void main(String[] args) 
	{
		String name="RADAR";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(rev.equals(name))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
