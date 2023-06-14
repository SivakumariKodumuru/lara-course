class M2 
{
	// IIB (instance initialization block)
	//this will be executed while objects are created before the execution of constructor.
	//IIB block comes under non static
	{
		System.out.println(i);
	}
	int i = 200;

	public static void main(String[] args) 
	{
	   M2 m2 = new M2();
	}
}
 
 // illegal forward reference applies to non-static variable also