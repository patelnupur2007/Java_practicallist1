class P6
{
	public static void main(String [] args)
	{
		double celcius,faheren;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter celcius ::");;
		celcius=sc.nextDouble();
	
		faheren=(celcius*1.8)+32;
		System.out.println("Value of Temperature in faherenheit ::"+faheren);
	}
}