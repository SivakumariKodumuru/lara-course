class K3 
{
	static int test()
	{
		return i = 90;
	}
	static int i;

	static int j = i;

	public static void main(String[] args) 
	{
		System.out.println("Hello World!  "+test());
		System.out.println("Hello World!  "+j);
	}
}
