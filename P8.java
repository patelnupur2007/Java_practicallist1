public class P8
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n=sc.nextInt();
		if(isprime(n))
		{
			System.out.println(n+"is a prime number");
		} 
		else
		{
			System.out.println(n+"is not a prime number");
		}
	}	
}