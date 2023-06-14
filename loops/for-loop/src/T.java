class T
{
	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++)
		{
		  System.out.println("loop begin");
		  if(i<4)
			{
			  break;
              System.out.println("Breack");  //---> unreachable syntax error//
			  
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
