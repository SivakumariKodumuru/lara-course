class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total argumrnts: "+args.length);
		for(String arg : args)
		{
			System.out.println(arg);
		}
	}
}


/* 

---->  JVM is is calling main method by supplying empty string array object as an argument
	   if we dont supply anything as a command line while executing the any class
	  
----> if we directly print the array reference we will be getting memory address of that array object
	  
----> each and every array having length.we  can find length by using 'length' pr0perty
	  
----> arrays are also objects in java
	  
----> array index will be starting from 0 but length should be calculating from 1
	  
----> if therer are no elements are present in the array then we can say that array is empty or size or length is 0
	  
----> by default(at the time of runningthe program in cmd prompt) whatever the value is we are supplying as command line argument that will be 
	  considered as String only

*/