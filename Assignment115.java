package assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Assignment115 //Write a program on sort method in collection class for String values .
{
	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<>();
		l1.add("Sourabh");
		l1.add("Mangal");
		l1.add("Shreesha");
		l1.add("Ankita");
		l1.add("Datta");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);

	}

}
