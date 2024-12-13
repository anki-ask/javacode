package assignments1;
import java.util.Arrays;
public class Assignment78//Write a program to check if the given number is part of an Array or not 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[3];
		rollno[0]=44;
		rollno[1]=55;
		rollno[2]=66;
		System.out.println(Arrays.toString(rollno));
		int a=44;
		for(int i=0;i<3;i++)
		{
			if(rollno[i]==a)
			{
				System.out.println("Number is present in given array");
				break;
			}	
			if(rollno[i]!=a)
			{
				System.out.println("Number not present");
				break;
			}
		}
	}
}
