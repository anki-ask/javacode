package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment119//Write a program to print name and Salary using the put() method in the Map Interface. 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> m1=new HashMap<>();
		m1.put("Ankita", 364839);
		m1.put("Shreesha", 479834);
		m1.put("Vaibhav", 6348720);
		m1.put("Namrata", 6398439);
		m1.put("Avdhoot", 6498324);
		System.out.println(m1);
	}

}
