class O2
{

	public static void main(String[] args) 
	{
		O2 o1 = new O2();
		System.out.println(o1);
		o1 = new O2();
		System.out.println(o1);
	}
}
//abandoned objects having are not having any reference.
//if none of the references are points to an object,that object is called as abadoned object
  // any object is not having at least one reference is called as abandoned object.