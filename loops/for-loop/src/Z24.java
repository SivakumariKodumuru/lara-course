class Z24
{ 
   public static void main(String[] args) 
	  {
	      System.out.println("main begin"); 

 
       for(int i = 1; i <= 5; i++) 
	   { 
	      System.out.println("loop body begin with " + i);  
          if(i == 3) 
	      {       
			  
			 continue;
             break;
          } 
          System.out.println("loop body end with " + i);   
       }  
       System.out.println("main end");  
  }
} 