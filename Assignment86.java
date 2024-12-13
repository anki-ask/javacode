package assignments1;

public class Assignment86 //Write a program to replace all the lower case letter with nothing in the string "Kv No 2"
{

	public static void main(String[] args) 
	{
		String s1="Kv No 2";
		String s2=s1.replaceAll("[a-z]", "");
		System.out.println(s2);
	}

}
