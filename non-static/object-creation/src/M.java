class M 
{
	int i;
	static int l;
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println(m1.i);

		
		m1.i = 10;
		System.out.println(m1.i);
	}
	static
	{
		M m2 = new M();
		System.out.println(m2.i);
		m2.i = 20;
		System.out.println(m2.i);

		
	}

}
