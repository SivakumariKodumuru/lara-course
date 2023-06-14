class U
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		System.out.println(flag);
		if((flag = false) && (flag = true))
		{
			System.out.println("hai");
		
		}
		System.out.println("end");
		System.out.println(flag);
	}                                                                                                                                                                                               
}
