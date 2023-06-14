class  O
{
	public static void main(String[] args) 
	{ 
		int i = 0;
		int j = 0;
	    while(i<3)
		{
		   System.out.println("loop1 begin"+i);
		    
			while(j<3)
			{
			   j++;
			   System.out.println("loop2 begin"+j);
			   if(j>1)
				{
			       break;
				}
				System.out.println("loop2 end");
			   
			}
			System.out.println("end"+i);
			i++;
			
			
		}
	}
}
