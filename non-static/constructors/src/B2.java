class B2 
{
	B2()
	{
		System.out.println("B()");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B2 b1 = new B2();
		System.out.println("------");
		B2 b2 = new B2();
		System.out.println("--------");
	}
	
}
