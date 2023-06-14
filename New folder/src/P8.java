class A 
{
	static int i;
	static 
	{
		System.out.println("SIB1 from A");
	}
	static
	{
		System.out.println("SIB2 from A");
	}
}
class P8
{
    static
	{
		System.out.println("SIB1 from p8");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!  "+A.i);
	}
}
