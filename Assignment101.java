package assignment2;
import java.util.*;
public class Assignment101 //write a program on add All method in the Collection class .
{
	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(98);
		l1.add(23);
		System.out.println(l1);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(35);
		l2.add(99);
		l2.add(24);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
	}
}
