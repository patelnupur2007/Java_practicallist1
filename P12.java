class P13
{
	public static void main(String [] args)
	{
		Scanner ssc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array :");
		int n=sc.nextInt();

		System.out.println("Enter the elements of the array ::");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int product=1;
		int i=0;
		while(i<n)
			product*=arr[i];
			i++;
		System.out.println("Product of all elments in the array :"+product);
	}
}