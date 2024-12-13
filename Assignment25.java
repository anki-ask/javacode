package Assignments;

public class Assignment25//Write a program on method Overloading and constructor overloading 
{
	Assignment25()
	{
		System.out.println("Constructor");
	}
	Assignment25(int a)
	{
		System.out.println("Overloading constructor");
	}
	static void area_of_circle()
	{
		int r=4;
		float pi=2.14f;
		float area;
		area=pi*r*r;
		System.out.println(area);
	}
	static void area_of_circle(int a)
	{
		int r=8;
		float pi=2.14f;
		float area;
		area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		Assignment25 a1=new Assignment25();
		area_of_circle();
		area_of_circle(5);
		Assignment25 a2=new Assignment25(6);
	}

}
