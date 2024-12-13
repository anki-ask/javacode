package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment122//Write a program using the Equals() method in the Map Interface.
{
	public static void main(String[] args)
	{
		Map<Object,Object> m1=new HashMap<>();
		m1.put("Ankita", 'F');
		m1.put("Shreesha", 'F');
		m1.put("Vaibhav", 'M');
		m1.put("Namrata", 'F');
		m1.put("Avdhoot", 'M');
		System.out.println(m1);
		
		Map<Object,Object> m2=new HashMap<>();
		m2.putAll(m1);
		System.out.println(m1.equals(m2));
	}
}
