class D1
{

	int i;
	int j = 20;
	D1()
	{
		System.out.println("D()");
		i = 10;
		j = 30;
		j = 45;
	}
	public static void main(String[] args) 
	{
		D1 d1 = new D1();
		System.out.println("-----");
		System.out.println(d1.i);
		System.out.println(d1.j);

	}
}
