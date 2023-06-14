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
	         System.out.println("some thing went wrong in the loop and coming away from the loop");   
             break;   
          } 
          System.out.println("loop body end with " + i);   
       }  
       System.out.println("main end");  
  }
} 