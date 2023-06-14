class V
{
	public static void main(String[] args) 
	{
		int i=4;
		do
		{
			System.out.println("loop begin" +i);
			int j = 8;
			do
			{
				System.out.println("loop begin" +j);
				j++;
				System.out.println("loop end" + j);
			}
			while(j<10);
			i++;
			System.out.println("loop end" + i);
		}
		while (i<8);
	}

}

