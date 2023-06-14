class F 
{
	int i;
	F(int k)
	{
		this.i = 10;
		i = 90;
		System.out.println("F(int)");
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		F f1 = new F(10);
		System.out.println(f1.i);
	}
}
