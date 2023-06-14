class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = new O();
		O o3 = o2;
		O o4 = new O();
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		System.out.println(o1.i);
		o2.i = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o4.i);
	}
}
// one object can be reffered by any number of reference
//changes in one reference reflecting to all the references that are pointing to that object.
// a reference can be point to only one objec at a time.