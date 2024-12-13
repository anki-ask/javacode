package assignment2;
import java.util.ArrayList;
import java.util.List;
public class Assignment105 //write a program on Contains All method in the Collection class.
{
	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(98);
		l1.add(23);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(34);
		l2.add(98);
		l2.add(23);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.containsAll(l2));
	}
}
