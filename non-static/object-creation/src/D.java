class D 
{
	void test()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		test1();
		System.out.println("from test2");
	}
}
