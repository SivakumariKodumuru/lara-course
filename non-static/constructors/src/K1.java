class K1
 
{
	K1()
	{
		System.out.println("K()");
	}
	{
		System.out.println("IIB");
	}
	K1(int i)
	{
		this();
		System.out.println("K(int) ");
	}
	static
	{
		System.out.println("SIB1");
	}
	K1(int i,int j)
	{
		this(j);
		System.out.println("K(int,int)");
	}
	static 
	{
		System.out.println("SIB2");

	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		K1 k1 = new K1();
		System.out.println("------");
		K1 k2 = new K1(100);
		System.out.println("-----");
		K1 k3 = new K1(100,200);
		System.out.println("------");
	}
}
