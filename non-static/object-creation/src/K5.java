class K5
{
	 int j;

     static int i;

	 static K5 k1 = new K5();

	 static
	{
	   System.out.println("SIB begin:" +i);
	   k1.i=50;
	   
	   System.out.println("SIB end:" +i);
	}

	 public static void main(String[] args)
	{
		 System.out.println("main:" +k1.i);
		 K5 k2 = new K5();
		 System.out.println(k2.j);
	}
	
	
}