package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment118 //Write a program to print name and gender using the put() method in the Map Interface.
{

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<>();
		m1.put("Ankita", 'F');
		m1.put("Shreesha", 'F');
		m1.put("Vaibhav", 'M');
		m1.put("Namrata", 'F');
		m1.put("Avdhoot", 'M');
		System.out.println(m1);

	}

}
