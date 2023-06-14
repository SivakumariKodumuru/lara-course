class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		student("a","v",1.0);
		System.out.println("main end");
	}
	public static void student(String name,String batch,double height)
	{
		System.out.println("from test  :  "+name);
		System.out.println("from test  :  "+batch);
		System.out.println("from test  :  "+height);
	}
}
