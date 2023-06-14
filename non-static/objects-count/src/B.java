class B 
{
	static int p =20;

	public static void main(String[] args) 
	{
		System.out.println("a: " +p);
		System.out.println("b: " +B.p);
		B obj = new B();
		
		System.out.println("c: "+obj.p);
	}
}
/* all the static memebers of a class will be shared by each and every object of that class. 
by using any reference of any object we can access any static member */

// compailer replacing from reference variable to class name

// by using any object we can able to access or modify the static members.

//only original static member only will be getting modified . because

//static members get loaded only once not again and again 
