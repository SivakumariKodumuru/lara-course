class E1 
{
	{
		System.out.println("E_IIB1");
	}
	E1(int i)
	{
		System.out.println("E(int)");
	}
	public static void main(String[] args) 
	{
		E1 e1 = new E1(90);
		System.out.println("---------");
		E1 e2 = new E1(30);
		System.out.println("---------");
	}
	{
		System.out.println("E_IIB2");
	}
	
}
