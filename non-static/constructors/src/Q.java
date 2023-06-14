class Q
{
	Q()
	{
		this(10);
		System.out.println("Q()");
	}
	Q(int i)
	{
		this(10);
		System.out.println("Q(int)");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		System.out.println("Hello World!");
		Q q2 = new Q(1,2);
		System.out.println("Hello World!");
		Q q3 = new Q(20);	
		System.out.println("Hello World!");

	}
}
