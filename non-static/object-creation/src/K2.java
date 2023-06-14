// create object in static variable level

class K2 
{
     int i;
	 
	 static K2 o = new K2();
	 static
	{
		System.out.println(o.i);
		
	}
	
}

