class A
{
	A()
	{
		super();
         System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		//super();--->internally calling super() 
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		//super();--->internally calling super() 
		System.out.println("C()");
	}
}
class P extends C
{
	P()
	{
		System.out.println("P()");
	}
	public static void main(String[] args) 
	{
		xA obj = new A();
		System.out.println("----------");
		B b1 = new B();
		System.out.println("----------");
		C c1 = new C();
		System.out.println("----------");
     	P P1 = new P();
		System.out.println("----------");
	}
}
