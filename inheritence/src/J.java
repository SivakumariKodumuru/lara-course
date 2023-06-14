class I 
{
	static int m;
	int n;
	static void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test");
	}
}
class J extends I
{
	public static void main(String[] args)
	{
		System.out.println(J.m);   //---->this statement is static so no need to creat obj are any reference 
		J.test1();

		J ref = new J();  
		System.out.println(ref.n);//this statement is non-static we need to create object and refeence variale to this
		ref.test2();
	}
}