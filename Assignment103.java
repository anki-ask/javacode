package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment103 //write a program on isempty method in the Collection class.
{

	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(98);
		l1.add(23);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.isEmpty());
	}

}
