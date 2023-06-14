class F3
{
	F3(int i)
	{
		System.out.println("F3(int)");
	}
	{
		System.out.println("IIB1");
	}

	F3()
	{
		this(40);
		System.out.println("F3()");
	}
	{
		System.out.println("IIB@");
	}
	
	public static void main(String[] args) 
	{
		F3 f1 = new F3();
		System.out.println("-----");
		F3 f2 = new F3(10);
		System .out.println("-----");

	}
}
