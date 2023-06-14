class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i);
	{
		S();
		System.out.prinln("S(int)");
	}

	public static void main(String[] args) 
	{
		S obj1 = new S();
		System.out.println("-----");
		S obj = new S(20);
		System.out.println("Hello World!");
	}
}
