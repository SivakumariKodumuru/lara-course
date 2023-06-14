class F1 
{
	{
		System.out.println("F1-IIB1");
	}

	F1(int i)
	{
		this();
		System.out.println("F1(int)");
	}
	F1()
	{
		System.out.println("F1()");
	}

	public static void main(String[] args) 
	{
		F1 f1 = new F1();
		System.out.println("-----");
		F1 f2 = new F1(10);
		System .out.println("-----");

	}
}
