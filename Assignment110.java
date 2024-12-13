package assignment2;
import java.util.ArrayList;
import java.util.List;
public class Assignment110 //write a program on List Methods from add() to size() in the List Class
{
	public static void main(String[] args) 
	{
		List c2=new ArrayList();
		c2.add("VW");
		c2.add("Suzuki");
		c2.add("Creata");
		c2.add("Ford");
		c2.add("Audi");
		System.out.println(c2);
		List c3=new ArrayList();
		c3.addAll(c2);
		System.out.println(c3);
		c3.clear();
		System.out.println(c3);
		System.out.println(c2.contains(c3));
		System.out.println(c2.containsAll(c3));
		System.out.println(c2.equals("VW"));
		System.out.println(c2.isEmpty());
		c2.remove("Audi");
		System.out.println(c2);
		int ss=c2.size();
		System.out.println(ss);
	}

}
