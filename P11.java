class p11
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.prrintln("Enter the size of the array :");
		int size=sc.nextInt();
		int[]arr=new int[size];
		int sum=0;

		System.out.println("Enter the elements of the array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of the array elements is ::"+sum);
	}
}