class A 
{
	static int i;
	static void test()
	{
		System.out.println("from A.test");
	}
	static
	{
		System.out.println("from A.SIB");
	}
}
class B
{
	static int j;
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("from B.SIB");
	}

 }
 class M4
 {
	 static
	{
		System.out.println("from M4.SIB");
	}
	 public static void main(String[] args)
	 {
		 System.out.println("main begin");
		 A.test();
		 System.out.println("----");
		 B.test();
		 System.out.println("----");
		 System.out.println(A.i);
		 System.out.println("----");
		 System.out.println(B.j);
		 System.out.println("----");
		 A.test();
		 System.out.println("----");
		 B.test();
		 System.out.println("main end");
		 
	}
}
