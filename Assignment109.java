package assignment2;
import java.util.*;
public class Assignment109//write a program on While Loop.using iteration method(hasNext and Next) 
{
	public static void main(String[] args) 
	{
		 Collection c1=new ArrayList();
		 c1.add("Ankita");
		 c1.add("Kokitkar");
		 c1.add(null);
		 c1.add(null);
		 c1.add(89);
		 c1.add('a');
		 System.out.println(c1);
		 Iterator i1=c1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
	}

}
