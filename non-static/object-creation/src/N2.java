class N2
{
	static int i;
	public static void main(String[] args) 
	{
		N2 n1 = new N2();
		N2 n2 = new N2(); // static int i is only one copy / here reintialization only happen
        N2 n3 = new N2();
		
		n2.i = 20;
		n3.i = 25;
		n1.i = 10;
		System.out.println(n2.i);
		System.out.println(n1.i);
		System.out.println(n3.i);
		
	}
}
// incase of non static n1.i and n2.i is different copy of int i