class Z32 
{ 
	public static void main(String[] args)
	{  
			System.out.println("main begin");   
			loop1: 
	        for(int i = 1; i <= 5; i++) 
	        {   
	           System.out.println("outer loop body begin with " + i); 
			   loop2:
               for(int j = 100; j <= 105; j++) 
	           { 
 
                  System.out.println("inner loop body begin with " + i + ", " + j); 
	              if(j == 103)   
		          {   
					  break loop1;
		          }    
	              System.out.println("inner loop body end with " + i + ", " + j);    
	           }    
	           System.out.println("outer loop body end with " + i); 
			   
	        }  
	        System.out.println("main end"); 
	}
} 