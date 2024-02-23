public p13
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size=sc.nextInt();
		int[] array=next int[size];
		int i=0;
		
		while(i<size)
			System.out.println("Enter elements ::"+(i+1)+":");
			arary[i]=sc.nextInt();
			i++;
		int max=array[0];
		i=1;
		do
		{
			if(array[i]>max)
				max=array[i];
			i++;
		}while(i<size);
			System.out.println("The maximum vaalue in the array is :"+max);
		
	}
}