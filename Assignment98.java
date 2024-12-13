package assignments1;
import java.util.Date;
public class Assignment98//Write a program to find out Current time Future Time Past time 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println("Current Epoch time: "+d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		Date d3=new Date(d1.getTime()-(1000*60*60*24*1));

		System.out.println("Future Time: "+d2);
		System.out.println("Past Time: "+d3);

		

	}

}
