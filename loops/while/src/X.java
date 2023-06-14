class X
{
	public static void main(String[] args) 
	{
		int i=0;
		do
		{
			System.out.println("loop begin" +i);
			int j = 0;
			do
			{
				System.out.println("loop begin" +j);
				j++;
				System.out.println("loop end" + j);
			}
			while(j<2);
			i++;
			System.out.println("loop end" + i);
		}
		while (i<8);
	}

}

