class Y
{
	public static void main(String[] args) 
	{
		int i=0;
		if((i++ == 1) || (i++ == 1))
		{
			System.out.println("hai");
			i++;
		}
		System.out.println("end");
		System.out.println(i);
	}
}
