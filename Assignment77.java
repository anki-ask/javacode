package assignments1;
import java.util.Arrays;
public class Assignment77 //Write a program to check if 2 Arrays are equals or not
{
	public static void main(String[] args) 
	{
		int age[]=new int[3];
		age[0]=56;
		age[1]=47;
		age[2]=22;
		String s1=Arrays.toString(age);
		System.out.println(s1);
		int age1[]=new int[3];
		age1[0]=56;
		age1[1]=47;
		age1[2]=22;
		String s2=Arrays.toString(age1);

		System.out.println(s2);
		if(s1.equals(s2)==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}
