package assignments1;
public class Assignment80//write a program to find 1: Number of Alphabet 2: Number of Numeric3: Number of Space4:Number of Special characterin Given string : "KV no 2" 
{
	public static void main(String[] args) 
	{
		String name="KV no 2";
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<7;i++)
		{
			if((name.charAt(i)>'A'&&name.charAt(i)<'Z')||(name.charAt(i)>'a'&&name.charAt(i)<'z'))
			{
				count=count+1;
			}
		}
		System.out.println("Number of Alphabets:"+count);
		
		for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 48 && name.charAt(i) <= 57)
            {
                count1++;
            }
		}
		System.out.println("Number of numeric:"+count1);
		
		for (int i = 0; i < name.length(); i++) 
		{
            if (name.charAt(i)==' ')
            {
            	count2++;
            }
		}
		System.out.println("Number of spaces: "+count2);
	
		count3=name.length()-count-count1-count2;
		System.out.println("Number of special character: "+count3);
	}
}
