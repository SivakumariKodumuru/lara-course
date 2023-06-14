class M 
{
	M(int i)
	{
		System.out.println("M(int");
	}
	public static void main(String[] args) 
	{
		M m1 = new M(10);
		System.out.println("Hello World!");
		M m2 = new M();
		System.out.println("Hello World!");
	}
}
