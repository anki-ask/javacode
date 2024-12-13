package assignments1;
import java.util.Arrays;
public class Assignment79//Write a program on all the Methods of String Functions from length() to till toCharArray() 
{
	public static void main(String[] args) 
	{
		String s1[]=new String[2];
		s1[0]="Ankita";
		s1[1]="Sourabh";
		String s3="Kokitkar";
		String s2=Arrays.toString(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.charAt(3));
		System.out.println(s2.concat(s3));
		System.out.println(s2.endsWith(s2));
		System.out.println(s2.contains("Ankita"));
		System.out.println(s2.endsWith(s3));
		System.out.println(s2.lastIndexOf('r'));
		System.out.println(s2.isEmpty());
		System.out.println(s2.replaceFirst("Ankita", "Shreesha"));
		

	}

}
