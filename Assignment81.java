package assignments1;
public class Assignment81 //Write a program to calculate average value of below array element [5,8,16,20,5]
{
	public static void main(String[] args) 
	{
		int num[]=new int[5];
		num[0]=5;
		num[1]=8;
		num[2]=16;
		num[3]=20;
		num[4]=5;
		int length=num.length;
		int sum=0;
		double average=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+num[i];
		}
		average=sum/length;
		System.out.println("Average of given array is:"+average);
	}

}
