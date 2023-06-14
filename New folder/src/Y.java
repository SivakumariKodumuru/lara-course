class BC
{
	static int i = 10;
	static  
	{
		System.out.println("A.SIB:" + i);
		i = 20;
	}
}
class CD
{
	static
	{
		System.out.println("W.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println("main end");
	}
}
/*output
A.SIB:10
20
---------------
20
---------------
main end*/

