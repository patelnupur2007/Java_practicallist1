class P5
{
	public static void main(String [] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers for perform to all operation :: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition of two numbers are ::"+(a+b));
		System.out.println("Substraction of two numbers are ::"+(a-b));
		System.out.println("Multiplication of two numbers are ::"+(a*b))
		System.out.println("Division of two numbers are ::"+(a/b));
		System.out.println("Modulo of two numbers are ::"+(a%b));
	}
}