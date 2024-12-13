package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment121//Write a program using the putIfAbsent() method in the Map Interface. 
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
		m1.putIfAbsent("Rekha",'F');
		System.out.println(m1);
	}

}
