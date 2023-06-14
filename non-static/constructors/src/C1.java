class C1 
{
	C1()
	{
		System.out.println("C()");
	}

	{
		System.out.println("IIB");
	}
	C1(int i)
	{
		System.out.println("C(int)");
	}
	public static void main(String[] args) 
	{
		C1 c1 = new C1();
		System.out.println("------");
		C1 c2 = new C1(10);
		System.out.println("------");
	}
}
