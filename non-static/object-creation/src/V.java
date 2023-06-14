class V 
{
	int i;
	static V test()	// method return type can be class type
	{
		return new V();	// creating an object while returning
	}
	public static void main(String[] args) 
	{
		V v1 = test();// test method is now having V class object
		System.out.println(v1.i);
	}
}

// if we find anywhere 'new' then definately it is a creation of object
