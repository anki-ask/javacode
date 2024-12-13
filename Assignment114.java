package assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Assignment114 //Write a program on sort method in collection class for integer values .
{
	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<>();
		l1.add(87);
		l1.add(56);
		l1.add(18);
		l1.add(98);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}

}
