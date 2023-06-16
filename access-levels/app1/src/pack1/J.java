package pack1;
class  J
{
	private int x;//X is private
	int y;//y is the default / package / friendly
}
class K 
{
  	public static void main(String[] args) 
	{
		//K k1 = new K();
		J j1  = new J();
		System.out.println(k1.x);
		System.out.println(k1.y);
	}
}
