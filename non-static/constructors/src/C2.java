class C2
{
	C2()
	{
		System.out.println("C2()");
	}

	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		
		C2 c1 = new C2();
		System.out.println("------");
		C2 c2 = new C2();
		System.out.println("------");
	}
}
