package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment124 //Write a program on Remove() method with Key and Both Key ,Value parameters in the Map Interface.
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
		m1.remove("Avdhoot");
		System.out.println(m1);
		m1.remove("Namrata", 'F');
		System.out.println(m1);
	}

}
