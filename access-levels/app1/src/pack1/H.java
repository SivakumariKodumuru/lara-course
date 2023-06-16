package pack1;
class H
{
   private int i;
   public void set(int i)
	{
	   this.i = i;
	   this.i=this.i;
	   i = this.i;//this represents current object.  if the local and global having the same name, then local one will be givin  the reference.
	               //that why when you are refering to global variable include 'this'
	}
	public int get()
	{
		return i;
	}
}
class I
{
	public static void main(String[] args) 
	{
		H h1 =new H();
		System.out.println(h1.get());
		h1.set(90);
		System.out.println(h1.get());
	}
}
