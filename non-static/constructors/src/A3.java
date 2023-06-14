class A3 
{
	A3()
	{
		System.out.println("A()");
	}
	A3(int i)
	{
		System.out.println("A(int i)");
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		A3 a1 = new A3();
		System.out.println("-----");
		A3 a2 =  new A3(10);
		System.out.println("----");

	}
}
