class B1 
{
	B1()
	{
		System.out.println("B()");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		B1 b1 = new B1();
		System.out.println("------");
		B1 b2 = new B1();
		System.out.println("--------");
	}
	
}
