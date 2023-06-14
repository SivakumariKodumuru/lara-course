class W 
{
	static
	{
		System.out.println("SIB");
	}
	W();
	{
		System.out.println("W()");
	}

	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("Hello World!");
		W w2 = new W();
		System.out.println("Hello World!");
	}
}
