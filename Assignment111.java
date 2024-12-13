package assignment2;
import java.util.*;
public class Assignment111 //write a program on List Interface for ListIterator() of forward Iteration and Backward Iteration and Iterator() also.
{
	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add("Neha");
		l1.add("Monali");
		l1.add("Vaishvi");
		l1.add("Ankita");
		l1.add("Shreesha");
		l1.add("Ketaki");
		
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("----------");
		ListIterator l2=l1.listIterator();
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		System.out.println("------------");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
	}

}
