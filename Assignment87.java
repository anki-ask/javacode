package assignments1;

public class Assignment87 //Write a program to replace all the numeric  with nothing in the string "Kv No 2"
{
	public static void main(String[] args) 
	{
		String s1="Kv No 2";
		String s2=s1.replaceAll("[0-9]", "");
		System.out.println(s2);
	}

}
