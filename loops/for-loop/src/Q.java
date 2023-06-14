class Q 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<6;i++)
		{
		  System.out.println(i);
		  if(i<4 || i<9) 
			{
			  continue;
			  
			}
			System.out.println(i);
		}
		System.out.println("main end");
	}
}
