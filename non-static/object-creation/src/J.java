class J 
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		J o = new J();
		o.test1();
		System.out.println("from test 2");
	}
}
