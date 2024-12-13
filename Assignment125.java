package assignment2;
import java.util.HashMap;
import java.util.Map;
public class Assignment125 //Write a program on Get() method in the Map Interface.
{
	public static void main(String[] args) 
	{
		Map<String,String> m1=new HashMap<>();
		m1.put("Ankita", "NYCT2791");
		m1.put("Shreesha", "NYCT3728");
		m1.put("Pradnya", "NYCT2379");
		m1.put("Namrata", "NYCT6822");
		m1.put("Naina", "NYCT3904");
		System.out.println(m1);
		System.out.println(m1.get("Naina"));

	}

}
