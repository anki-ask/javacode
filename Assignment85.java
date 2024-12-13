package assignments1;

public class Assignment85 //Write a program to remove all the capital letter from given string"Manish Tiwari"
{

	public static void main(String[] args) 
	{
		String s1="Manish Tiwari";
		String s2=s1.replaceAll("[A-Z]", "");
		System.out.println(s2);
	}

}
