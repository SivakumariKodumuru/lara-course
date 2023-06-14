class U 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!"+i);
		i = 1;
		test();
		System.out.println("Hello World!"+i);
		i=2;
		U.test();
		System.out.println("Hello World!"+i);
	}
	public static void test()
	{
		System.out.println("Hello World!"+i);
		i += 3 ;
	}
}
