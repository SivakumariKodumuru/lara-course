class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;

		System.out.println("main end:" +i);
				test(i++);
	}
	public static void test(int i)
	{
		System.out.println("from test" +i);
		i = 30;
	}
}
