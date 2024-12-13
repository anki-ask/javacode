package Assignments;//Write a program with different string function

public class Assignment68 
{
	public static void main(String[] args) 
	{
		String name="  Ankita Kokitkar";
		String name1="Ankita";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('o'));
		System.out.println(name.substring(9));
		System.out.println(name.substring(2, 8));
		System.out.println(name.equals(name1));
		System.out.println(name.contains(name1));
		System.out.println(name.equalsIgnoreCase(name1));
	}

}
