import java.util.*;
public class P1
{
	public static void main(String [] args)
	{
		Scanner get=new Scanner(System.in);
		int a=0,b=0,c=0,sum=0;
		float avg;
		System.out.println("Addition of three numbers ::");
		System.out.print("Enter the three numbers ::");
		a=get.nextInt();
		b=get.nextInt();
		c=get.nextInt();

		sum=a+b+c;
		avg=sum/3;

		System.out.println("Sum is ::"+sum);
		System.out.println("Average is ::"+avg);
	}
}