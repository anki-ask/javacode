package assignment2;
import java.util.ArrayList;
import java.util.List;
public class Assignment106 //write a program on Remove method in the Collection class
{

	public static void main(String[] args) 
	{
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(98);
		l1.add(23);
		System.out.println(l1);
		l1.remove(0);
		System.out.println(l1);
	}

}