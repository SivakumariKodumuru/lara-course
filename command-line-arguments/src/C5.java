class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total argumrnts: "+args.length);
		System.out.println("-----------------");
		//String s1=args[0];
		char c1=args[0].charAt(0); // it is not converting from string to char,just fecting the values from a particular index
		// we cannot convert string to char
		System.out.println(c1);
	}
}


// internally string is a array of characters and those will have indexes start from 0