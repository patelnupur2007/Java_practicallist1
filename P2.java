import java.util.*;
public class P2
{
	public static void main(String [] args)
	{
		Scanner get=new Scanner(System.in);
		flaot radius,area;
	
		System.out.println("Enter the radius of circle ::");
		radius=get.nextFloat();
		area=3.14*radius*radius;
		System.out.println("Area of Circle ::"+area);
	}
}