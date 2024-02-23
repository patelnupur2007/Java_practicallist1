class P7
{
	public static void main(String [] args)
	{
  		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms (n) in the Fibonacci sequence ::");
		int n=sc.nextInt();

		System.out.println("Fibonacci sequence for the first "+n+"+terms :");
		printFibonacciseries(n);

		sc.close();
	}
	public static void printFibonacciseries(int n)
	{
		int firstterm=0,secondterm=1;
		for(int i=0;i<n;i++)
		{
			System.out.println(firstTerm + " ");
		}
		int nextTerm=firstterm+secondterm;
		firstterm=secondterm;
		secondterm=nextterm;	
	}
}