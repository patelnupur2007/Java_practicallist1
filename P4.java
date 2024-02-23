import java.util.*;
public class P4
{
	public static void main(String [] args)
	{
		int n,rev=0,rem=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for convert into reverse number ::");
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			System.out.println("The reverse number is :"+rev);
		}
	}
}