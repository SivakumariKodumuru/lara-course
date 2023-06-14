class A 
{
	static void test()
	{
		System.out.println("SIB1 from A");
	}
}
class P10
{
   
	public static void main(String[] args) 
	{
		System.out.println("main begin  ");
		 A.test();
		System.out.println("main end");
	}
}
