class R 
{
	int i;
	static void test(R obj)//obj=r1
	{
		obj.i=20;
	}
	public static void main(String[] args) 
	{
		R r1=new R();
		r1.i=10;
		System.out.println("A: "+r1.i);
		// pass by reference or call by reference
		test(r1);
		System.out.println("B: "+r1.i);
	}
}
 // changes in the destination is reflecting ti the source also
