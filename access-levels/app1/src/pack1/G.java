package pack1;
class  F
{
	private static int i = 90;//its private
    static void test()//test method should not be private
	{
		System.out.println(i);
	}
}
class G
{
	public static void main(String[] args) 
	{
		//System.out.println(F.i);
		F.test();
	}
}

//
