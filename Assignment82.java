package assignments1;
import java.util.Arrays;
public class Assignment82 //Write a program to print the given array in reverse manner [5,8,16,20,5]
{
	public static void main(String[] args) 
	{
		int num[]=new int[5];
		num[0]=5;
		num[1]=8;
		num[2]=16;
		num[3]=20;
		num[4]=5;
		int s1;
		System.out.println(Arrays.toString(num));
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}

}
