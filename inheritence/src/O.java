class M
{
	M()
	{
		super();
         System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		//super();--->internally calling super() 
		System.out.println("N()");
	}
}
class O extends N
{
	public static void main(String[] args) 
	{
		M obj = new M();
		System.out.println("----------");
		N n1 = new N();
		System.out.println("----------");
		O o1 = new O();
		System.out.println("----------");
	}
}
