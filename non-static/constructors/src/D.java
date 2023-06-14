class D
{

	int i = 100;
	D()
	{
		System.out.println("D()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		D c1 = new D();
		System.out.println("-----");
		System.out.println(c1.i);

	}
}
 