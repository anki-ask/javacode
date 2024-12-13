package assignments1;
public class Assignment95 //Write a program where Input is"Manish Kumar tiwari"Output" M K T in horizontal
{
	public static void main(String[] args) 
	{
		String s1="Manish Kumar Tiwari";
		String s2=s1.replaceAll("[a-z]", "");
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i));
		}
	}

}
