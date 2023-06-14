class F4
{
	F4()
	{
		System.out.println("F4()");
	}
	{
		System.out.println("IIB");
	}
	static
	{
		System.out.println("SIB");
	}
	public static void main (String[] args)
	{
		F4 f1 = new F4();
		System.out.println("----");
		F4 f2 = new F4();
		System.out.println("----");
		F4 f3 = new F4();
		System.out.println("---");
	}
}