class F2 
{
	{
		System.out.println("IIB1");
	}

	F2()
	{
		this(40);
		System.out.println("F2()");
	}
	F2(int i)
	{
		System.out.println("F2(int)");
	}

	public static void main(String[] args) 
	{
		F2 f1 = new F2();
		System.out.println("-----");
		F2 f2 = new F2(10);
		System .out.println("-----");

	}
}
