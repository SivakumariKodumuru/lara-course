class Al 
{
	public static void main(String[] args) 
	{
		int i = 9;
		{
			{
				{
					int j = 10;
		            System.out.println("inner normal block:"+j);
				}
				
			    System.out.println("outernormalblock:" +i);
				
			}
			System.out.println("main end:"+i);
		}
	}
}
